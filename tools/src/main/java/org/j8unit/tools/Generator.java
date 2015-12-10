package org.j8unit.tools;

import static java.lang.String.join;
import static java.lang.System.lineSeparator;
import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.Spliterator.IMMUTABLE;
import static java.util.Spliterator.NONNULL;
import static java.util.Spliterator.ORDERED;
import static java.util.Spliterators.spliteratorUnknownSize;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.tools.AccessLevel.PRIVATE;
import static org.j8unit.tools.ClassKind.TOP_LEVEL;
import static org.j8unit.tools.GeneratorSetup.getClassName;
import static org.j8unit.tools.GeneratorUtil.createTypeParametersStatement;
import static org.j8unit.tools.GeneratorUtil.createTypeParametersStatement2;
import static org.j8unit.tools.GeneratorUtil.createTypeParametersUsage;
import static org.j8unit.tools.GeneratorUtil.getClassNameWithTypeVariableNames;
import static org.j8unit.tools.Iterators.classHierarchy;
import static org.j8unit.tools.Membership.CLASS;
import static org.j8unit.tools.Membership.INSTANCE;
import static org.j8unit.tools.OptionalString.ofEmptyable;
import static org.j8unit.tools.Utilities.getInterfaces;
import static org.j8unit.tools.Utilities.getJavaDocName;
import static org.j8unit.tools.Utilities.getJavadocName;
import static org.j8unit.tools.Utilities.getNearestMergingClass;
import static org.j8unit.tools.Utilities.isReallyDeclared;
import static org.j8unit.tools.Utilities.listAllClasses;
import static org.j8unit.tools.Utilities.runtimify;
import static org.j8unit.tools.Utilities.specifiesSuchPublicMethod;
import static org.j8unit.tools.Utilities.toVarArgAwareString;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParametersFactory;

@SuppressWarnings("deprecation")
public class Generator {

    private static final Logger LOG = Logger.getLogger(Generator.class.getName());

    public static final String NL = lineSeparator();

    private static final String SPACE = "    ";

    private static final String IGNORE_STATEMENT = "With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.";

    @SuppressWarnings("unused")
    public static final void main(final String[] args)
    throws Exception {
        final List<String> LANG_ONLY = asList("java.lang");
        final List<String> BASIC_JAVA = asList("java.lang", "java.io", "java.util");
        final List<String> FULL_JAVA = asList("java", "javax", "org");
        for (final String pakkage : FULL_JAVA) {
            LOG.info("Starting to generate test classes for [" + pakkage + "].");
            // configure setup
            final GeneratorSetup testSetup = GeneratorSetup.forJavaPackage(pakkage) //
                                                           .intoTargetFolder("src/main/java") //
                                                           .asSubPackageOf("org.j8unit.repository") //
                                                           .suffixForInstanceTestClass("Tests") //
                                                           .suffixForClassTestClass("ClassTests") //
                                                           .useTestMethodPrefix("test_") //
                                                           .useTestConstructorPrefix("create_") //
                                                           .capitaliseMethodInfix(false) //
                                                           .overwriteExistingFiles(true) //
                                                           .build();
            // run generator
            // new Generator(testSetup).generateEveryTestClass();
            final GeneratorSetup specificSetup = GeneratorSetup.similarTo(testSetup) //
                                                               .intoTargetFolder("src/test/java") //
                                                               .suffixForInstanceTestClass("Test") //
                                                               .suffixForClassTestClass("ClassTest") //
                                                               .overwriteExistingFiles(true) //
                                                               .build();
            new Generator(specificSetup).generateEverySpecificTestClass(testSetup);
        }
    }

    private final GeneratorSetup setup;

    public Generator(final GeneratorSetup setup) {
        this.setup = setup;
    }

    protected void generateEveryTestClass()
    throws IOException {
        // determine all classes
        final Set<Class<?>> classes = listAllClasses(this.setup.originLocation, this.setup.pakkage);
        // generate test classes
        for (final Class<?> clazz : classes) {
            // this.generateTestClass(clazz, INSTANCE);
            this.generateTestClass(clazz, CLASS);
        }
        // determine all packages
        final Set<Package> packages = classes.stream().map(Class::getPackage).collect(toSet());
        // generate package infos
        for (final Package pakkage : packages) {
            this.generatePackageInfo(pakkage);
        }
    }

    protected void generateTestClass(final Class<?> clazz, final Membership membership)
    throws IOException {
        if (TOP_LEVEL.mismatches(clazz)) {
            // defer enveloped class
            LOG.fine("Defer [" + clazz + "] because it is not top-level.");
        } else if (this.setup.skipClass(clazz)) {
            // skip classes by current setup
            LOG.warning("Skipping [" + clazz + "] by current setup.");
        } else {
            LOG.info("Handling [" + clazz + "].");
            // create target folder (unless existing)
            final Path folder = this.setup.folderForClass(clazz);
            folder.toFile().mkdirs();
            // generate test class' content
            final String content = this.contentOfTestClass(clazz, membership);
            // create test class (unless existing)
            final File file = folder.resolve(this.setup.getSimpleTestClassName(clazz, membership) + ".java").toFile();
            if (file.createNewFile() || this.setup.isOverwriteMode()) {
                LOG.info("Creating/Overwriting test class file for [" + clazz + "].");
                try (final Writer writer = new FileWriter(file)) {
                    writer.write(content);
                }
            } else {
                LOG.info("Skipping creation of an already existing test class file for [" + clazz + "].");
            }
            LOG.info("Finished [" + clazz + "].");
        }
    }

    /**
     * @see http://stackoverflow.com/questions/1961350/problem-in-the-getdeclaredmethods-java
     */
    private String contentOfTestClass(final Class<?> clazz, final Membership membership) {
        LOG.info("Creating content of test class for [" + clazz + "].");
        final StringBuilder sb = new StringBuilder();
        sb.append("package " + this.setup.packageForClass(clazz) + ";" + NL);
        sb.append(NL);
        sb.append("import " + org.j8unit.J8UnitTest.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.j8unit.repository.categories.J8UnitRepository.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.Test.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.experimental.categories.Category.class.getName() + ";" + NL);
        sb.append("import " + java.lang.annotation.Annotation.class.getName() + ";" + NL);
        sb.append("import " + java.lang.reflect.Method.class.getPackage().getName() + ".*;" + NL);
        sb.append("import static " + org.junit.Assert.class.getName() + ".*;" + NL);
        sb.append(NL);
        if (Membership.INSTANCE.equals(membership)) {
            sb.append(this.contentOfTestClassForInstance(clazz, membership, 0));
        } else {
            sb.append(this.contentOfTestClassForInstance(clazz, membership, 0));
        }
        return sb.toString();
    }

    private String contentOfTestClassForInstance(final Class<?> clazz, final Membership membership, final int enclosingLevel) {
        // calculate hierarchically closest class node with a usable super class and store interfaces found meanwhile
        final Map<Class<?>, Type> skipped = new LinkedHashMap<>();
        final Map<Class<?>, Type> parents = new LinkedHashMap<>();
        StreamSupport.stream(spliteratorUnknownSize(classHierarchy(clazz), ORDERED & NONNULL & IMMUTABLE), false) //
                     .peek(c -> getInterfaces(c).entrySet().stream() // store ...
                                                .filter(e -> this.setup.useClass(e.getKey())) // ... meanwhile ...
                                                .forEach(e -> parents.put(e.getKey(), e.getValue()))) // ... interfaces
                     .peek(c -> {
                         if (!this.setup.useClass(c.getSuperclass())) {
                             // store skipped classes
                             skipped.put(c.getSuperclass(), c.getGenericSuperclass());
                         }
                     }) //
                     .filter(c -> this.setup.useClass(c.getSuperclass())) //
                     .findFirst() //
                     .ifPresent(c -> parents.put(c.getSuperclass(), c.getGenericSuperclass()));
        if (!skipped.isEmpty()) {
            LOG.warning("The following super classes of [" + clazz + "] will be skipped: " + skipped.keySet());
        }
        LOG.info("The test class of [" + clazz + "] extends the test behaviour of the following interfaces and classes: " + parents.keySet());
        // collect constructors methods
        final Set<Constructor<?>> constructors = Arrays.stream(clazz.getDeclaredConstructors()) //
                                                       .filter(PRIVATE::mismatches) //
                                                       .filter(this.setup::useConstructor) //
                                                       .filter(membership::matches) //
                                                       .collect(toSet());
        LOG.info("The test class of [" + clazz + "] will create test methods for the following constructors: " + constructors);
        // collect non-private, explicitly declared 'membership' methods
        final Set<Method> declaredMethods = Arrays.stream(clazz.getDeclaredMethods()) //
                                                  .filter(PRIVATE::mismatches) //
                                                  .filter(this.setup::useMethod) //
                                                  .filter(membership::matches) //
                                                  .filter(m -> isReallyDeclared(clazz, m)) //
                                                  .collect(toSet());
        LOG.info("The test class of [" + clazz + "] will create test methods for the following methods: " + declaredMethods);
        // collect public 'membership' methods that are not specified by its merging class
        // (Note: Class#getMethods() returns only public methods but this is OK because there is no merging problem for
        // protected methods)
        final Set<Method> duplicatedCandidates = Arrays.stream(clazz.getMethods()) //
                                                       .filter(this.setup::useMethod) //
                                                       .filter(membership::matches) //
                                                       // keep in mind the method might be overwritten, so map it to the
                                                       // most specific method ...
                                                       .map(m -> runtimify(() -> clazz.getMethod(m.getName(), m.getParameterTypes())).get()) //
                                                       // ... us only if it is a candidate
                                                       .filter(m -> !specifiesSuchPublicMethod(getNearestMergingClass(clazz, m).get(), m)) //
                                                       .collect(toSet());
        LOG.info("The test class of [" + clazz + "] will potentially merge the following methods: " + duplicatedCandidates);
        // collect sub-classes
        final Set<Class<?>> subClasses = Arrays.stream(clazz.getDeclaredClasses()) //
                                               .filter(PRIVATE::mismatches) //
                                               .filter(this.setup::useClass) //
                                               .collect(toSet());
        LOG.info("The [" + clazz + "] contains the following inner/nested classes: " + subClasses);
        // prepare statements
        final String indent = join("", nCopies(enclosingLevel, SPACE));
        final String nested = enclosingLevel > 0 ? "static " : "";
        final String testClassName = this.setup.getSimpleTestClassName(clazz, membership);
        final String testClassSuper = OptionalString.ofEmptyable(parents.entrySet().stream() //
                                                                        .map(e -> this.setup.getTestClassName(e.getKey(), membership) //
                                                                                  + "<SUT"
                                                                                  + (Membership.INSTANCE.equals(membership) ? ofEmptyable(createTypeParametersUsage(e.getValue())).prepend(",")
                                                                                                                                                                                  .orElse("") : "")
                                                                                  + ">") //
                                                                        .collect(joining("," + NL + indent + "        "))) //
                                                    .orElse(Membership.INSTANCE.equals(membership) ? "J8UnitTest<SUT>" : "J8UnitTest<Class<SUT>>");
        final String sutSuper = getClassNameWithTypeVariableNames(clazz, membership);
        final String parameters = ofEmptyable(createTypeParametersStatement(clazz)).prepend(", ").orElse("");
        // append test class content
        final StringBuilder sb = new StringBuilder();
        sb.append(this.contentOfTestClassJavaDoc(clazz, membership, indent));
        sb.append(Membership.CLASS.equals(membership) && !parameters.isEmpty() ? indent + "@SuppressWarnings(\"rawtypes\")" + NL : "");
        sb.append(indent + "@FunctionalInterface" + NL);
        sb.append(indent + "@Category(" + J8UnitRepository.class.getSimpleName() + ".class)" + NL);
        sb.append(indent + "public " + nested + "abstract interface " + testClassName + "<SUT extends "
                  + (Membership.INSTANCE.equals(membership) ? getClassNameWithTypeVariableNames(clazz, Membership.INSTANCE)
                                                              + parameters : getJavadocName(clazz))
                  + ">" + NL);
        sb.append(indent + "extends " + testClassSuper + NL);
        sb.append(indent + "{" + NL);
        sb.append(NL);
        for (final Constructor<?> constructor : constructors) {
            sb.append(this.contentOfTestConstructor(constructor, indent + SPACE));
            sb.append(NL);
        }
        if (CLASS.equals(membership)) {
            sb.append(indent + SPACE + "@Test" + NL);
            sb.append(indent + SPACE + "public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {" + NL);
            sb.append(indent + SPACE + SPACE + "// create new instance" + NL);
            sb.append(indent + SPACE + SPACE + /* sutSuper + */ "Class<SUT> sut = createNewSUT();" + NL);
            sb.append(indent + SPACE + SPACE + "// assert assignability" + NL);
            sb.append(indent + SPACE + SPACE + "assertTrue(" + getClassName(clazz) + ".class.isAssignableFrom(sut));" + NL);
            sb.append(indent + SPACE + "}" + NL);
            sb.append(NL);
        }
        for (final Method method : declaredMethods) {
            sb.append(this.contentOfTestMethod(method, parents, indent + SPACE, false, membership));
            sb.append(NL);
        }
        for (final Method method : duplicatedCandidates) {
            sb.append(this.contentOfTestMethod(method, parents, indent + " ", true, membership));
            sb.append(NL);
        }
        for (final Class<?> subClass : subClasses) {
            sb.append(this.contentOfTestClassForInstance(subClass, membership, enclosingLevel + 1));
            sb.append(NL);
        }
        sb.append(indent + "}" + NL);
        return sb.toString();
    }

    private String contentOfTestClassJavaDoc(final Class<?> clazz, final Membership membership, final String indent) {
        final StringBuilder sb = new StringBuilder();
        switch (membership) {
            case CLASS:
                sb.append(indent + "/**" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * Test class for {@link " + clazz.getName() + " " + clazz.toString() + "}," + NL);
                sb.append(indent + " * containing all class relevant test methods (at least the test methods of accessible constructors and" + NL);
                sb.append(indent + " * of accessible {@code static} methods). The counterpart test class containing the instance relevant test" + NL);
                sb.append(indent + " * methods is {@link " + this.setup.getTestClassName(clazz, INSTANCE) + "}." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * In addition, there may be assertions concerning the class itself." + NL);
                sb.append(indent + " * For example, <a href=\"https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1\"><q>by" + NL);
                sb.append(indent + " * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type" + NL);
                sb.append(indent + " * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>" + NL);
                sb.append(indent + " * Thus, {@link " + this.setup.getTestClassName(Annotation.class, membership) + "}" + NL);
                sb.append(indent + " * provides a corresponding, inheritable test method:" + NL);
                sb.append(indent + " * {@link " + this.setup.getTestClassName(Annotation.class, membership) + "#hasNoCustomParametrizedMethod()}." + NL);
                sb.append(indent + " * Similarly, this class is not only intended to assert some static method's behaviour but also to verify" + NL);
                sb.append(indent + " * runtime constraints and further class specific requirements." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @param SUT the class' type of the subject-under-test" + NL);
                sb.append(indent + " * @since 0.9.0" + NL);
                sb.append(indent + " * @see " + this.setup.getTestClassName(clazz, INSTANCE) + NL);
                sb.append(indent + " */" + NL);
                break;
            case INSTANCE:
                sb.append(indent + "/**" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * Test class for {@link " + clazz.getName() + " " + clazz.toString() + "}," + NL);
                sb.append(indent + " * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods)." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @param SUT the type of the subject-under-test" + NL);
                sb.append(indent + " * @since 0.9.0" + NL);
                sb.append(indent + " * @see " + this.setup.getTestClassName(clazz, CLASS) + NL);
                sb.append(indent + " */" + NL);
                break;
        }
        return sb.toString();
    }

    private String contentOfTestConstructor(final Constructor<?> constructor, final String indent) {
        // prepare statements
        final String testMethodName = this.setup.getSimpleTestMethodName(constructor);
        final String names = GeneratorUtil.getClassNameWithUUnboundTypeVariableNames(constructor.getDeclaringClass(), INSTANCE);
        // append test method content
        final StringBuilder sb = new StringBuilder();
        sb.append(this.contentOfConstructorJavaDocComment(constructor, indent));
        sb.append(indent + "@Ignore(\"" + IGNORE_STATEMENT + "\")" + NL);
        sb.append(indent + "@Test" + NL);
        sb.append(indent + "@Category(" + Draft.class.getSimpleName() + ".class)" + NL);
        sb.append(indent + "public default void " + testMethodName + "() throws Exception {" + NL);
        sb.append(indent + SPACE + "// create new instance" + NL);
        sb.append(indent + SPACE + "@SuppressWarnings(\"unused\")" + NL);
        sb.append(indent + SPACE + names + " sut = null; // = new " + getJavaDocName(constructor).split("#")[1] + ";" + NL);
        sb.append(indent + "}" + NL);
        return sb.toString();
    }

    private String contentOfConstructorJavaDocComment(final Constructor<?> constructor, final String indent) {
        final StringBuilder sb = new StringBuilder();
        sb.append(indent + "/**" + NL);
        sb.append(indent + " * Test method for {@link " + getJavaDocName(constructor) + " " + toVarArgAwareString(constructor) + "}." + NL);
        sb.append(indent + " */" + NL);
        return sb.toString();
    }

    private String contentOfTestMethod(final Method method, final Map<Class<?>, Type> parents, final String indent, final boolean mergeMode,
                                       final Membership membership) {
        // collect all declaring super nodes
        final Set<Class<?>> candidates = parents.keySet().stream().map(s -> getNearestMergingClass(s, method)).flatMap(Utilities::toStream).collect(toSet());
        LOG.info("The method [" + method + "] is inherited via " + candidates + ".");
        if (mergeMode && (candidates.size() < 2)) {
            LOG.info("There is no need to specify a test method for [" + method
                     + "] because (a) it is not inherited more than once and (b) it is not overwritten within current class.");
            return "";
        }
        // prepare statements
        final String override = candidates.isEmpty() ? "" : indent + "@Override" + NL;
        final String testMethodName = this.setup.getSimpleTestMethodName(method);
        // append test method content
        final StringBuilder sb = new StringBuilder();
        sb.append(this.contentOfMethodJavaDocComment(method, indent, mergeMode));
        sb.append(indent + "@Ignore(\"" + IGNORE_STATEMENT + "\")" + NL);
        sb.append(indent + "@Test" + NL);
        sb.append(indent + "@Category(" + Draft.class.getSimpleName() + ".class)" + NL);
        sb.append(override);
        sb.append(indent + "public default void " + testMethodName + "() throws Exception {" + NL);
        if (!mergeMode) {
            sb.append(indent + SPACE + "// query fresh subject-under-test" + NL);
            sb.append(indent + SPACE + (Membership.INSTANCE.equals(membership) ? "SUT" : "Class<SUT>") + " sut = this.createNewSUT();" + NL);
            sb.append(indent + SPACE + "assert sut != null;" + NL);
        }
        sb.append(indent + "}" + NL);
        return sb.toString();
    }

    private String contentOfMethodJavaDocComment(final Method method, final String indent, final boolean mergeMode) {
        final StringBuilder sb = new StringBuilder();
        if (mergeMode) {
            /*
             * [QUOTE] Duplicate default methods named test_toString with the parameters () and () are inherited from
             * the types ObjectTests<SUT> and CharSequenceTests<SUT> [/QUOTE]
             */
            sb.append(indent + "/**" + NL);
            sb.append(indent + " * <p>" + NL);
            sb.append(indent + " * The method-under-test covered by this test method is inherited duplicatedly within" + NL);
            sb.append(indent + " * the declaring class-under-test. In result, there are duplicated according test" + NL);
            sb.append(indent + " * method within the super test classes. To solve this situation, this method must be" + NL);
            sb.append(indent + " * overriden. Dont't worry, there will be meaningful test methods soon and, thus," + NL);
            sb.append(indent + " * overriding becomes unnecessary." + NL);
            sb.append(indent + " * </p>" + NL);
            sb.append(indent + " */" + NL);
        } else {
            sb.append(indent + "/**" + NL);
            sb.append(indent + " * <p>" + NL);
            sb.append(indent + " * Test method for {@link " + getJavaDocName(method) + " " + toVarArgAwareString(method) + "}." + NL);
            sb.append(indent + " * </p>" + NL);
            sb.append(indent + " */" + NL);
        }
        return sb.toString();
    }

    private void generatePackageInfo(final Package pakkage)
    throws IOException {
        // create target folder (unless existing)
        final Path folder = this.setup.folderForPackage(pakkage);
        folder.toFile().mkdirs();
        // generate package info's content
        final String content = this.j8PackageJavaDoc(pakkage);
        // create package info (unless existing)
        final File file = folder.resolve("package-info.java").toFile();
        if (file.createNewFile() || this.setup.isOverwriteMode()) {
            LOG.info("Creating package info file for [" + pakkage + "].");
            try (final Writer writer = new FileWriter(file)) {
                writer.write(content);
            }
        } else {
            LOG.info("Skipping creation of an already existing package info file for [" + pakkage + "].");
        }
    }

    private String j8PackageJavaDoc(final Package pakkage) {
        LOG.info("Creating JavaDoc content of a package info file for [" + pakkage + "].");
        final StringBuilder sb = new StringBuilder();
        sb.append("/**" + NL);
        sb.append(" * <p>" + NL);
        sb.append(" * This package contains all the <strong>reusable tests</strong> targeting the behaviour of components of package {@code "
                  + pakkage.getName() + "}." + NL);
        sb.append(" * </p>" + NL);
        sb.append(" *" + NL);
        sb.append(" * <p>" + NL);
        sb.append(" * According to <a href=\"https://docs.oracle.com/javase/specs/jls/se8/html/jls-6.html#jls-6.1\">The Java Language" + NL);
        sb.append(" * Specification (Java SE 8 Edition), Section.&nbsp;6.1</a>, some package's &quot;[&hellip;] first identifier" + NL);
        sb.append(" * [&hellip;] should not be the identifier {@code java} [&hellip;]&quot;. Thus, this test class collection" + NL);
        sb.append(" * is limited to accessible classes (i.&thinsp;e., top-level," + NL);
        sb.append(" * <a href=\"http://docs.oracle.com/javase/tutorial/java/javaOO/nested.html\">nested, inner</a>), accessible" + NL);
        sb.append(" * methods, and accessible constructors&nbsp;&ndash; simply because it cannot place test classes in the" + NL);
        sb.append(" * class-under-test's {@code java.*} package (which otherwise would allow access to {@code protected}, resp." + NL);
        sb.append(" * <em>package-private</em> elements)." + NL);
        sb.append(" * </p>" + NL);
        sb.append(" *" + NL);
        sb.append(" * @since 0.9.0" + NL);
        sb.append(" * @author <a href=\"mailto:stefan@gasterstädt.de\">Stefan Gasterst&auml;dt</a>" + NL);
        sb.append(" * @author <a href=\"mailto:sascha.zak@zak-digital.de\">Sascha Zak</a>" + NL);
        sb.append(" */" + NL);
        sb.append("package " + this.setup.packageForPackage(pakkage) + ";" + NL);
        return sb.toString();
    }

    protected void generateEverySpecificTestClass(final GeneratorSetup testSetup)
    throws IOException {
        // determine all classes
        final Set<Class<?>> classes = listAllClasses(this.setup.originLocation, this.setup.pakkage);
        // generate test classes
        for (final Class<?> clazz : classes) {
            this.generateSpecificTestClass(clazz, INSTANCE, testSetup);
            this.generateSpecificTestClass(clazz, CLASS, testSetup);
        }
    }

    protected void generateSpecificTestClass(final Class<?> clazz, final Membership membership, final GeneratorSetup testSetup)
    throws IOException {
        if (TOP_LEVEL.mismatches(clazz)) {
            // defer enveloped class
            LOG.fine("Defer [" + clazz + "] because it is not top-level (membership = [" + membership + "]).");
        } else if (this.setup.skipClass(clazz)) {
            // skip classes by current setup
            LOG.warning("Skipping [" + clazz + "] by current setup (membership = [" + membership + "]).");
        } else {
            LOG.info("Handling [" + clazz + "] (membership = [" + membership + "])");
            // generate test class' content
            final String content = this.contentOfSpecificTestClass(clazz, membership, testSetup);
            if (content.length() > 0) {
                // create target folder (unless existing)
                final Path folder = this.setup.folderForClass(clazz);
                folder.toFile().mkdirs();
                // create test class (unless existing)
                final File file = folder.resolve(this.setup.getSimpleTestClassName(clazz, membership) + ".java").toFile();
                if (file.createNewFile() || this.setup.isOverwriteMode()) {
                    LOG.info("Creating/Overwriting specific test class file for [" + clazz + "].");
                    try (final Writer writer = new FileWriter(file)) {
                        writer.write(content);
                    }
                } else {
                    LOG.info("Skipping creation of an already existing specific test class file for [" + clazz + "].");
                }
            }
            LOG.info("Finished [" + clazz + "].");
        }
    }

    protected String contentOfSpecificTestClass(final Class<?> clazz, final Membership membership, final GeneratorSetup testSetup) {
        LOG.info("Creating content of test class for [" + clazz + "] with membership [" + membership + "].");
        final String content = this.contentOfSpecificTestClass(clazz, membership, 0, testSetup);
        final StringBuilder sb = new StringBuilder();
        if (content.length() > 0) {
            sb.append("package " + this.setup.packageForClass(clazz) + ";" + NL);
            sb.append(NL);
            sb.append(this.imports(clazz));
            sb.append(content);
        }
        return sb.toString();
    }

    protected String contentOfSpecificTestClass(final Class<?> clazz, final Membership membership, final int enclosingLevel, final GeneratorSetup testSetup) {
        LOG.info("Creating content of test class for [" + clazz + "] (membership = [" + membership + "].");
        final String content;
        if (clazz.isEnum() && INSTANCE.equals(membership)) {
            LOG.info("[" + clazz + "] is enum and the membership is [" + membership + "].");
            content = this.contentOfSpecificEnumInstanceTestClass((Class<? extends Enum<?>>) clazz, membership, enclosingLevel, testSetup);
        } else if (!Modifier.isAbstract(clazz.getModifiers()) && INSTANCE.equals(membership)) {
            LOG.info("[" + clazz + "] is not abstract and the membership is [" + membership + "].");
            content = this.contentOfSpecificDefaultInstanceTestClass(clazz, membership, enclosingLevel, testSetup);
        } else if (CLASS.equals(membership)) {
            LOG.info("[" + clazz + "] with membership is [" + membership + "].");
            content = this.contentOfSpecificClassTestClass(clazz, membership, enclosingLevel, testSetup);
        } else {
            LOG.info("[" + clazz + "] has no senseful use-case.");
            content = "";
        }
        return content;
    }

    private String imports(final Class<?> clazz) {
        final StringBuilder sb = new StringBuilder();
        sb.append("import static " + TestParametersUtil.class.getName() + ".*;" + NL);
        sb.append("import " + Supplier.class.getName() + ";" + NL);
        sb.append("import " + FactoryBasedJ8UnitTest.class.getName() + ";" + NL);
        sb.append("import " + J8Unit4.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + J8BlockJUnit4ClassRunnerWithParametersFactory.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + Test.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + RunWith.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + JUnit4.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + BlockJUnit4ClassRunnerWithParametersFactory.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + Parameterized.class.getName() + ".*;" + NL);
        sb.append(NL);
        return sb.toString();
    }

    private String contentOfSpecificEnumInstanceTestClass(final Class<? extends Enum<?>> clazz, final Membership membership, final int enclosingLevel,
                                                          final GeneratorSetup testSetup) {
        final String indent = join("", nCopies(enclosingLevel, SPACE));
        final String nested = enclosingLevel > 0 ? "static " : "";
        final String testClassName = this.setup.getSimpleTestClassName(clazz, membership);
        final String sutSuper = getClassNameWithTypeVariableNames(clazz, membership);
        final String parameters = ofEmptyable(createTypeParametersStatement(clazz)).prepend(", ").orElse("");
        final String testClassSuper = testSetup.getTestClassName(clazz, membership) //
                                      + "<SUT" + ofEmptyable(createTypeParametersUsage(clazz)).prepend(",").orElse("") + ">";
        final String testClassSuper2 = testSetup.getTestClassName(clazz, membership) //
                                       + "<" + sutSuper + ofEmptyable(createTypeParametersStatement2(clazz)).prepend(",").orElse("") + ">";
        final String className = GeneratorSetup.getClassName(clazz);
        final StringBuilder sb = new StringBuilder();
        sb.append(indent + "@RunWith(J8Parameterized.class)" + NL);
        sb.append(indent + "@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)" + NL);
        sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(createTypeParametersStatement(clazz)).surround("<", ">").orElse("")
                  + NL);
        sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
        sb.append(NL);
        sb.append(indent + SPACE + "@Parameters(name = \"{index}: {0}\")" + NL);
        sb.append(indent + SPACE + "public static Iterable<Object[]> sutData() {" + NL);
        sb.append(indent + SPACE + SPACE + "return testParametersOfEnumClass(" + className + ".class);" + NL);
        sb.append(indent + SPACE + "}" + NL);
        sb.append(NL);
        sb.append(indent + SPACE + "@Parameter(0)" + NL);
        sb.append(indent + SPACE + "public " + sutSuper + " sut;" + NL);
        sb.append(NL);
        sb.append(indent + SPACE + "@Override" + NL);
        sb.append(indent + SPACE + "public " + sutSuper + " createNewSUT() {" + NL);
        sb.append(indent + SPACE + SPACE + "return this.sut;" + NL);
        sb.append(indent + SPACE + "}" + NL);
        sb.append(NL);
        // collect sub-classes
        final Set<Class<?>> subClasses = Arrays.stream(clazz.getDeclaredClasses()) //
                                               .filter(PRIVATE::mismatches) //
                                               .filter(this.setup::useClass) //
                                               .collect(toSet());
        LOG.info("The [" + clazz + "] contains the following inner/nested classes: " + subClasses);
        for (final Class<?> subClass : subClasses) {
            sb.append(this.contentOfSpecificTestClass(subClass, membership, enclosingLevel + 1, testSetup));
            sb.append(NL);
        }
        sb.append(indent + "}" + NL);
        return sb.toString();
    }

    private String contentOfSpecificDefaultInstanceTestClass(final Class<?> clazz, final Membership membership, final int enclosingLevel,
                                                             final GeneratorSetup testSetup) {
        final String indent = join("", nCopies(enclosingLevel, SPACE));
        final String nested = enclosingLevel > 0 ? "static " : "";
        final String testClassName = this.setup.getSimpleTestClassName(clazz, membership);
        final String sutSuper = getClassNameWithTypeVariableNames(clazz, membership);
        final String parameters = ofEmptyable(createTypeParametersStatement(clazz)).prepend(", ").orElse("");
        final String testClassSuper = testSetup.getTestClassName(clazz, membership) //
                                      + "<" + sutSuper + ofEmptyable(createTypeParametersUsage(clazz)).prepend(",").orElse("") + parameters + ">";
        final String testClassSuper2 = testSetup.getTestClassName(clazz, membership) //
                                       + "<" + sutSuper + ofEmptyable(createTypeParametersStatement2(clazz)).prepend(",").orElse("") + ">";
        final String className = GeneratorSetup.getClassName(clazz);

        Optional<Constructor<?>> constructor = Optional.empty();
        Optional<Constructor<?>> saveConstructor = Optional.empty();
        try {
            constructor = Stream.<Constructor<?>> of(clazz.getDeclaredConstructor()) //
                                .filter(PRIVATE::mismatches) //
                                .filter(this.setup::useConstructor) //
                                .findFirst();
            saveConstructor = constructor.filter(c -> stream(c.getExceptionTypes()).allMatch(RuntimeException.class::isAssignableFrom));
        } catch (NoSuchMethodException | SecurityException any) {}

        final StringBuilder sb = new StringBuilder();

        if (saveConstructor.isPresent()) {
            sb.append(indent + "@RunWith(J8Unit4.class)" + NL);
            sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(createTypeParametersStatement(clazz)).surround("<", ">").orElse("")
                      + NL);
            sb.append(indent + "implements FactoryBasedJ8UnitTest<" + sutSuper + ">, " + testClassSuper2 + " {" + NL);
            sb.append(NL);
            sb.append(indent + SPACE + "@Override" + NL);
            sb.append(indent + SPACE + "public Supplier<" + sutSuper + "> getSUTFactory() {" + NL);
            sb.append(indent + SPACE + SPACE + "return " + className + "::new;" + NL);
            sb.append(indent + SPACE + "}" + NL);
            sb.append(NL);
            // collect sub-classes
            final Set<Class<?>> subClasses = Arrays.stream(clazz.getDeclaredClasses()) //
                                                   .filter(PRIVATE::mismatches) //
                                                   .filter(this.setup::useClass) //
                                                   .collect(toSet());
            LOG.info("The [" + clazz + "] contains the following inner/nested classes: " + subClasses);
            for (final Class<?> subClass : subClasses) {
                sb.append(this.contentOfSpecificTestClass(subClass, membership, enclosingLevel + 1, testSetup));
                sb.append(NL);
            }
            sb.append(indent + "}" + NL);
        } else if (constructor.isPresent()) {
            sb.append(indent + "@RunWith(J8Unit4.class)" + NL);
            sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(createTypeParametersStatement(clazz)).surround("<", ">").orElse("")
                      + NL);
            sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
            sb.append(NL);
            sb.append(indent + SPACE + "@Override" + NL);
            sb.append(indent + SPACE + "public " + sutSuper + " createNewSUT() {" + NL);
            sb.append(indent + SPACE + "try {" + NL);
            sb.append(indent + SPACE + SPACE + "return new " + className + "();" + NL);
            sb.append(indent + SPACE + "} catch (final Exception cause) {" + NL);
            sb.append(indent + SPACE + SPACE + "throw new AssertionError(\"Failed to create new subject-under-test instance!\", cause);" + NL);
            sb.append(indent + SPACE + "}" + NL);
            sb.append(NL);
            sb.append(indent + "}" + NL);
            sb.append(NL);
            // collect sub-classes
            final Set<Class<?>> subClasses = Arrays.stream(clazz.getDeclaredClasses()) //
                                                   .filter(PRIVATE::mismatches) //
                                                   .filter(this.setup::useClass) //
                                                   .collect(toSet());
            LOG.info("The [" + clazz + "] contains the following inner/nested classes: " + subClasses);
            for (final Class<?> subClass : subClasses) {
                sb.append(this.contentOfSpecificTestClass(subClass, membership, enclosingLevel + 1, testSetup));
                sb.append(NL);
            }
            sb.append(indent + "}" + NL);
        } else {
            sb.append(indent + "@RunWith(J8Unit4.class)" + NL);
            sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(createTypeParametersStatement(clazz)).surround("<", ">").orElse("")
                      + NL);
            sb.append(indent + "implements FactoryBasedJ8UnitTest<" + sutSuper + ">, " + testClassSuper2 + " {" + NL);
            sb.append(NL);
            sb.append(indent + SPACE + "@Override" + NL);
            sb.append(indent + SPACE + "public Supplier<" + sutSuper + "> getSUTFactory() {" + NL);
            sb.append(indent + SPACE + SPACE + "throw new AssertionError(\"There is no default constructor for [" + className + "] available.\");" + NL);
            sb.append(indent + SPACE + "}" + NL);
            sb.append(NL);
            // collect sub-classes
            final Set<Class<?>> subClasses = Arrays.stream(clazz.getDeclaredClasses()) //
                                                   .filter(PRIVATE::mismatches) //
                                                   .filter(this.setup::useClass) //
                                                   .collect(toSet());
            LOG.info("The [" + clazz + "] contains the following inner/nested classes: " + subClasses);
            for (final Class<?> subClass : subClasses) {
                sb.append(this.contentOfSpecificTestClass(subClass, membership, enclosingLevel + 1, testSetup));
                sb.append(NL);
            }
            sb.append(indent + "}" + NL);
        }
        return sb.toString();
    }

    private String contentOfSpecificClassTestClass(final Class<?> clazz, final Membership membership, final int enclosingLevel,
                                                   final GeneratorSetup testSetup) {
        final String indent = join("", nCopies(enclosingLevel, SPACE));
        final String nested = enclosingLevel > 0 ? "static " : "";
        final String testClassName = this.setup.getSimpleTestClassName(clazz, membership);
        final String sutSuper = getClassNameWithTypeVariableNames(clazz, membership);
        final String parameters = ofEmptyable(createTypeParametersStatement(clazz)).prepend(", ").orElse("");
        final String testClassSuper = testSetup.getTestClassName(clazz, membership) //
                                      + "<SUT" + ofEmptyable(createTypeParametersStatement2(clazz)).prepend(",").orElse("") + ">";
        final String testClassSuper2 = testSetup.getTestClassName(clazz, membership) //
                                       + "<" + getClassNameWithTypeVariableNames(clazz, Membership.INSTANCE)
                                       + ofEmptyable(createTypeParametersStatement2(clazz)).prepend(",").orElse("") + ">";
        final String className = GeneratorSetup.getClassName(clazz);
        final StringBuilder sb = new StringBuilder();
        sb.append(indent + "@RunWith(J8Unit4.class)" + NL);
        sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(createTypeParametersStatement(clazz)).surround("<", ">").orElse("")
                  + NL);
        sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
        sb.append(NL);
        sb.append(ofEmptyable(createTypeParametersStatement(clazz)).map(s -> indent + SPACE + "@SuppressWarnings(\"unchecked\")" + NL).orElse(""));
        sb.append(indent + SPACE + "@Override" + NL);
        sb.append(indent + SPACE + "public Class<" + getClassNameWithTypeVariableNames(clazz, Membership.INSTANCE) + "> createNewSUT() {" + NL);
        sb.append(indent + SPACE + SPACE + "return " + ofEmptyable(createTypeParametersStatement(clazz)).map(s -> "(" + sutSuper + ") ").orElse("") + className
                  + ".class;" + NL);
        sb.append(indent + SPACE + "}" + NL);
        sb.append(NL);
        // collect sub-classes
        final Set<Class<?>> subClasses = Arrays.stream(clazz.getDeclaredClasses()) //
                                               .filter(PRIVATE::mismatches) //
                                               .filter(this.setup::useClass) //
                                               .collect(toSet());
        LOG.info("The [" + clazz + "] contains the following inner/nested classes: " + subClasses);
        for (final Class<?> subClass : subClasses) {
            sb.append(this.contentOfSpecificTestClass(subClass, membership, enclosingLevel + 1, testSetup));
            sb.append(NL);
        }
        sb.append(indent + "}" + NL);
        return sb.toString();
    }

}
