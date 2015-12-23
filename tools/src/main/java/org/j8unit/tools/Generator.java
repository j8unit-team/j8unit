package org.j8unit.tools;

import static java.lang.String.format;
import static java.lang.String.join;
import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.Spliterator.IMMUTABLE;
import static java.util.Spliterator.NONNULL;
import static java.util.Spliterator.ORDERED;
import static java.util.Spliterators.spliteratorUnknownSize;
import static java.util.logging.Logger.getLogger;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.tools.AccessLevel.PRIVATE;
import static org.j8unit.tools.ClassKind.TOP_LEVEL;
import static org.j8unit.tools.GeneratorSetup.NL;
import static org.j8unit.tools.GeneratorSetup.SPACE;
import static org.j8unit.tools.GeneratorSetup.canonicalClassOf;
import static org.j8unit.tools.GeneratorSetup.canonicalNameOf;
import static org.j8unit.tools.GeneratorSetup.canonicalNameWithTypeParametersNames;
import static org.j8unit.tools.GeneratorSetup.classNameWithUnboundTypeParametersOf;
import static org.j8unit.tools.GeneratorSetup.getInterfaces;
import static org.j8unit.tools.GeneratorSetup.getNearestMergingClass;
import static org.j8unit.tools.GeneratorSetup.isRawGeneric;
import static org.j8unit.tools.GeneratorSetup.isReallyDeclared;
import static org.j8unit.tools.GeneratorSetup.javadocNameOf;
import static org.j8unit.tools.GeneratorSetup.listAllClasses;
import static org.j8unit.tools.GeneratorSetup.simpleCanonicalClassOf;
import static org.j8unit.tools.GeneratorSetup.simpleCanonicalNameOf;
import static org.j8unit.tools.GeneratorSetup.specifiesSuchPublicMethod;
import static org.j8unit.tools.GeneratorSetup.toVarArgAwareString;
import static org.j8unit.tools.GeneratorSetup.typeParametersDefinitionsOf;
import static org.j8unit.tools.GeneratorSetup.typeParametersNamesOf;
import static org.j8unit.tools.GeneratorUtil.runtimed;
import static org.j8unit.tools.Iterators.classHierarchy;
import static org.j8unit.tools.Membership.CLASS;
import static org.j8unit.tools.Membership.INSTANCE;
import static org.j8unit.tools.OptionalString.ofEmptyable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
// import org.j8unit.repository.Aim;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.AssumptionViolatedException;
import org.junit.Ignore;
import org.junit.experimental.categories.Category;
import junit.framework.Test;

@SuppressWarnings("deprecation")
public class Generator
implements GeneratorLogMessages {

    private static final Logger LOG = getLogger(Generator.class.getName());

    private static final String IGNORE_STATEMENT = "With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.";

    @SuppressWarnings("unused")
    public static final void main(final String[] args)
    throws Exception {
        final List<String> LANG_ONLY = asList("java.lang");
        final List<String> BASIC_JAVA = asList("java.lang", "java.io", "java.util");
        final List<String> FULL_JAVA = asList("java", "javax", "org");
        for (final String pakkage : FULL_JAVA) {
            LOG.info(format(START_MAIN, pakkage));
            // configure setup
            final GeneratorSetup j8PackagesSetup = GeneratorSetup.forJavaPackage(pakkage) //
                                                                 .intoTargetFolder("../repository/src/main/java") //
                                                                 .asSubPackageOf("org.j8unit.repository") //
                                                                 .suffixForInstanceScopeTestClass("Tests") //
                                                                 .suffixForClassScopeTestClass("ClassTests") //
                                                                 .useTestMethodPrefix("test_") //
                                                                 .useTestConstructorPrefix("create_") //
                                                                 .capitaliseMethodInfix(false) //
                                                                 .overwriteExistingFiles(true) //
                                                                 .build();
            // run generator
            new Generator(j8PackagesSetup).generateEveryPackageInfo();
            final GeneratorSetup j8InterfacesSetup = GeneratorSetup.similarTo(j8PackagesSetup) //
                                                                   .overwriteExistingFiles(true) //
                                                                   .build();
            new Generator(j8InterfacesSetup).generateEveryJ8UnitTestInterface();
            final GeneratorSetup j8ClassesSetup = GeneratorSetup.similarTo(j8InterfacesSetup) //
                                                                .intoTargetFolder("../repository/src/test/java") //
                                                                .suffixForInstanceScopeTestClass("Test") //
                                                                .suffixForClassScopeTestClass("ClassTest") //
                                                                .overwriteExistingFiles(true) //
                                                                .build();
            new Generator(j8ClassesSetup).generateEveryJ8UnitTestClass(j8InterfacesSetup);
            LOG.info(format(FINISH_MAIN, pakkage));
        }
    }

    private final GeneratorSetup setup;

    public Generator(final GeneratorSetup setup) {
        this.setup = setup;
    }

    private void generateEveryPackageInfo()
    throws IOException {
        // determine all classes
        final Set<Class<?>> classes = listAllClasses(this.setup.originLocation, this.setup.pakkage);
        // determine all packages
        final Set<Package> packages = classes.stream().map(Class::getPackage).collect(toSet());
        // generate package infos
        for (final Package pakkage : packages) {
            this.generatePackageInfo(pakkage, this::generatePackageInfoContent);
        }
    }

    private void generatePackageInfo(final Package pakkage, final Function<Package, String> contentSource)
    throws IOException {
        LOG.info(format(HANDLING, pakkage));
        // create target folder (unless existing)
        final Path folder = this.setup.folderForPackage(pakkage);
        folder.toFile().mkdirs();
        // generate package info's content
        final String content = contentSource.apply(pakkage);
        // create package info (unless existing and disabled overwriting)
        final File file = folder.resolve(this.setup.filenameForPackage(pakkage)).toFile();
        if (file.createNewFile() || this.setup.isOverwriteMode()) {
            LOG.info(format(CREATE_PACKAGE_INFOFILE, pakkage));
            try (final Writer writer = new FileWriter(file)) {
                writer.write(content);
            }
        } else {
            LOG.info(format(SKIP_PACKAGE_INFOFILE, pakkage));
        }
        LOG.info(format(FINISHED, pakkage));
    }

    private String generatePackageInfoContent(final Package pakkage) {
        LOG.info(format(CREATE_PACKAGE_INFOFILE_CONTENT, pakkage));
        final StringBuilder sb = new StringBuilder();
        sb.append(this.packageJavaDoc(pakkage));
        sb.append(this.packageDeclaration(pakkage));
        return sb.toString();
    }

    private void generateEveryJ8UnitTestInterface()
    throws IOException {
        // determine all classes
        final Set<Class<?>> classes = listAllClasses(this.setup.originLocation, this.setup.pakkage);
        // generate test classes
        for (final Class<?> clazz : classes) {
            this.generateJ8UnitTestClass(clazz, INSTANCE, this::contentOfTestClass);
            this.generateJ8UnitTestClass(clazz, CLASS, this::contentOfTestClass);
        }
    }

    private void generateJ8UnitTestClass(final Class<?> clazz, final Membership membership, final BiFunction<Class<?>, Membership, String> contentSource)
    throws IOException {
        if (TOP_LEVEL.mismatches(clazz)) {
            // defer enveloped class
            LOG.fine(format(DEFER_TYPE, clazz));
        } else if (this.setup.skipClass(clazz)) {
            // skip classes by current setup
            LOG.warning(format(SKIP_TYPE, clazz));
        } else {
            LOG.info(format(HANDLING, clazz));
            // create target folder (unless existing)
            final Path folder = this.setup.folderForClass(clazz);
            folder.toFile().mkdirs();
            // generate test class' content
            final String content = contentSource.apply(clazz, membership);
            // create test class (unless existing)
            final File file = folder.resolve(this.setup.filenameForClass(clazz, membership)).toFile();
            if (file.createNewFile() || this.setup.isOverwriteMode()) {
                LOG.info(format(CREATE_J8UNIT_TESTINTERFACE, clazz, membership));
                try (final Writer writer = new FileWriter(file)) {
                    writer.write(content);
                }
            } else {
                LOG.info(format(SKIP_J8UNIT_TESTINTERFACE, clazz, membership));
            }
            LOG.info(format(FINISHED, clazz));
        }
    }

    private String contentOfTestClass(final Class<?> clazz, final Membership membership) {
        LOG.info(format(CREATE_J8UNIT_TESTINTERFACE_CONTENT, clazz, membership));
        final StringBuilder sb = new StringBuilder();
        sb.append(this.packageDeclaration(clazz));
        sb.append(this.imports(clazz));
        sb.append(this.testClassContent(clazz, membership, 0));
        return sb.toString();
    }

    /**
     * TODO: Known Bug: {@code KeySetView<K,V> extends CollectionView<K,V,K>} with package private
     * {@code CollectionView} binds {@code E} to {@code K} but that knowledge is lost by skipping unreachable package
     * private super classes.
     *
     * @see http://stackoverflow.com/questions/1961350/problem-in-the-getdeclaredmethods-java
     * @see https://javax0.wordpress.com/2014/02/26/syntethic-and-bridge-methods/
     */
    private String testClassContent(final Class<?> clazz, final Membership membership, final int enclosingLevel) {
        final boolean isRawGeneric = isRawGeneric(clazz);
        // calculate hierarchically closest class node with a usable super class; store interfaces found meanwhile
        final Map<Class<?>, Type> parents = new LinkedHashMap<>();
        StreamSupport.stream(spliteratorUnknownSize(classHierarchy(clazz), ORDERED & NONNULL & IMMUTABLE), false) //
                     .peek(c -> getInterfaces(c).entrySet().stream() // store ...
                                                .filter(e -> this.setup.useClass(e.getKey())) // ... meanwhile ...
                                                .forEach(e -> parents.put(e.getKey(), e.getValue()))) // ... interfaces
                     .peek(c -> {
                         if (!this.setup.useClass(c.getSuperclass())) {
                             LOG.warning(format(SKIP_TYPE_SUPER_CLASSES, clazz, c));
                         }
                     }) //
                     .filter(c -> this.setup.useClass(c.getSuperclass())) //
                     .findFirst() //
                     .ifPresent(c -> parents.put(c.getSuperclass(), c.getGenericSuperclass()));
        LOG.info(format(J8UNIT_TESTINTERFACE_REUSED_SUPERS, clazz, membership, parents.entrySet()));
        // collect non-private, explicitly declared membership-matching constructors
        final Set<Constructor<?>> constructors = Arrays.stream(clazz.getDeclaredConstructors()) //
                                                       .filter(PRIVATE::mismatches) //
                                                       .filter(this.setup::useConstructor) //
                                                       .filter(membership::matches) //
                                                       .peek(c -> {
                                                           if (!isReallyDeclared(clazz, c)) {
                                                               LOG.warning(format(SKIP_TYPE_CONSTRUCTORS, clazz, c));
                                                           }
                                                       }) //
                                                       .filter(c -> isReallyDeclared(clazz, c)) //
                                                       .collect(toSet());
        LOG.info(format(J8UNIT_TESTINTERFACE_AIMED_CONSTRUCTORS, clazz, membership, constructors));
        // collect non-private, explicitly declared membership-matching methods
        final Set<Method> methods = Arrays.stream(clazz.getDeclaredMethods()) //
                                          .filter(PRIVATE::mismatches) //
                                          .filter(this.setup::useMethod) //
                                          .filter(membership::matches) //
                                          .peek(m -> {
                                              if (!isReallyDeclared(clazz, m)) {
                                                  LOG.warning(format(SKIP_TYPE_METHODS, clazz, m));
                                              }
                                          }) //
                                          .filter(m -> isReallyDeclared(clazz, m)) //
                                          .collect(toSet());
        LOG.info(format(J8UNIT_TESTINTERFACE_AIMED_METHODS, clazz, membership, methods));
        // collect public membership-matching methods that are not specified by its merging class
        // (Note: Class#getMethods() returns only public methods but this is OK because there is no merging problem for
        // non-public methods)
        final Set<Method> duplicatedCandidates = Arrays.stream(clazz.getMethods()) //
                                                       .filter(this.setup::useMethod) //
                                                       .filter(membership::matches) //
                                                       // keep in mind the method might be overwritten, so map it to the
                                                       // most specific method ...
                                                       .map(m -> runtimed(() -> clazz.getMethod(m.getName(), m.getParameterTypes()))) //
                                                       // ... us only if it is a candidate
                                                       .filter(m -> !specifiesSuchPublicMethod(getNearestMergingClass(clazz, m).get(), m)) //
                                                       .collect(toSet());
        LOG.info(format(J8UNIT_TESTINTERFACE_MERGE_METHOD_CANDIDATES, clazz, membership, duplicatedCandidates));
        // collect sub-classes
        final Set<Class<?>> subClasses = Arrays.stream(clazz.getDeclaredClasses()) //
                                               .filter(PRIVATE::mismatches) //
                                               .filter(this.setup::useClass) //
                                               .collect(toSet());
        LOG.info(format(ENCLOSED_TYPES, clazz, subClasses));
        // prepare statements
        final String indent = join("", nCopies(enclosingLevel, SPACE));
        final String enclosed = enclosingLevel > 0 ? "static " : "";
        final String testClassName = membership.getTestClassName(clazz, this.setup);
        final String testClassSuperTypes = membership.getTestClassSuperTypes(parents, this.setup, isRawGeneric);
        final String sutSuperTypes = membership.getSutSuperTypes(clazz);
        final String suppressWarnings = membership.getTestClassSuppressWarnings(clazz);
        // append test class content
        final StringBuilder sb = new StringBuilder();
        sb.append(this.classJavaDoc(clazz, membership, indent));
        sb.append(ofEmptyable(suppressWarnings).surround(indent, NL).orElse(""));
        sb.append(indent + "@" + simpleCanonicalNameOf(FunctionalInterface.class) + NL);
        // sb.append(indent + "@" + simpleCanonicalNameOf(Aim.class) + "(clazz=" + canonicalClassOf(clazz) + ",
        // javadoc=\"" + canonicalNameOf(clazz) + "\")" + NL);
        sb.append(indent + "@" + simpleCanonicalNameOf(Category.class) + "(" + simpleCanonicalClassOf(J8UnitRepository.class) + ")" + NL);
        sb.append(indent + "public " + enclosed + "abstract interface " + testClassName + "<SUT extends " + sutSuperTypes + ">" + NL);
        sb.append(indent + "extends " + testClassSuperTypes + NL);
        sb.append(indent + "{" + NL);
        sb.append(NL);
        if (isRawGeneric) {
            sb.append(this.contentOfSutCreation(membership, indent + SPACE));
            sb.append(NL);
        }
        for (final Constructor<?> constructor : constructors) {
            sb.append(this.contentOfTestConstructor(constructor, indent + SPACE));
            sb.append(NL);
        }
        this.appendCustomContent(sb, clazz, membership, indent + SPACE);
        for (final Method method : methods) {
            sb.append(this.contentOfTestMethod(clazz, method, parents, indent + SPACE, false, membership));
            sb.append(NL);
        }
        for (final Method method : duplicatedCandidates) {
            sb.append(this.contentOfTestMethod(clazz, method, parents, indent + SPACE, true, membership));
            sb.append(NL);
        }
        for (final Class<?> subClass : subClasses) {
            sb.append(this.testClassContent(subClass, membership, enclosingLevel + 1));
            sb.append(NL);
        }
        sb.append(indent + "}" + NL);
        return sb.toString();
    }

    private Object contentOfSutCreation(final Membership membership, final String indent) {
        if (CLASS.equals(membership)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(indent + "// The definition of the SUT factory method must be repeated" + NL);
        sb.append(indent + "// because of the \"rawtypes\" nature of this 8Unit test interface" + NL);
        sb.append(indent + "// (caused by the \"rawtypes\" nature of the class-under-test)." + NL);
        sb.append(indent + "@Override" + NL);
        sb.append(indent + "public abstract SUT createNewSUT();" + NL);
        return sb.toString();
    }

    private String contentOfTestConstructor(final Constructor<?> constructor, final String indent) {
        // prepare statements
        final String testMethodName = this.setup.getSimpleTestMethodName(constructor);
        final String names = classNameWithUnboundTypeParametersOf(constructor.getDeclaringClass(), INSTANCE);
        // append test method content
        final StringBuilder sb = new StringBuilder();
        sb.append(this.contentOfConstructorJavaDocComment(constructor, indent));
        sb.append(indent + "@" + simpleCanonicalNameOf(Ignore.class) + "(\"" + IGNORE_STATEMENT + "\")" + NL);
        sb.append(indent + "@" + simpleCanonicalNameOf(Test.class) + NL);
        // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" +
        // canonicalClassOf(constructor.getDeclaringClass()) + ", executable=\"" + constructor
        // + "\", javadoc=\"" + javadocNameOf(constructor) + "\")" + NL);
        sb.append(indent + "@" + simpleCanonicalNameOf(Category.class) + "(" + simpleCanonicalClassOf(Draft.class) + ")" + NL);
        sb.append(indent + "public default void " + testMethodName + "() throws Exception {" + NL);
        sb.append(indent + SPACE + "// create new instance" + NL);
        sb.append(indent + SPACE + "@SuppressWarnings(\"unused\")" + NL);
        sb.append(indent + SPACE + names + " sut = null; // = new " + javadocNameOf(constructor).split("#")[1] + ";" + NL);
        sb.append(indent + "}" + NL);
        return sb.toString();
    }

    private String contentOfConstructorJavaDocComment(final Constructor<?> constructor, final String indent) {
        final StringBuilder sb = new StringBuilder();
        sb.append(indent + "/**" + NL);
        sb.append(indent + " * <p>" + NL);
        sb.append(indent + " * Test method for {@link " + javadocNameOf(constructor) + " " + toVarArgAwareString(constructor) + "}." + NL);
        sb.append(indent + " *" + NL);
        sb.append(indent + " * Up to now, there is no real implementation of this test method. But with your help" + NL);
        sb.append(indent + " * at <a href=\"http://www.j8unit.org\">http://www.j8unit.org</a> this marker method will" + NL);
        sb.append(indent + " * be replaced by meaningful test methods soon." + NL);
        sb.append(indent + " * </p>" + NL);
        sb.append(indent + " *" + NL);
        sb.append(indent + " * @j8unit.aim " + javadocNameOf(constructor) + NL);
        sb.append(indent + " */" + NL);
        return sb.toString();
    }

    private String contentOfTestMethod(final Class<?> clazz, final Method method, final Map<Class<?>, Type> parents, final String indent,
                                       final boolean mergeMode, final Membership membership) {
        // collect all declaring super nodes
        final Set<Class<?>> candidates = parents.keySet().stream().map(s -> getNearestMergingClass(s, method)).flatMap(GeneratorUtil::toStream)
                                                .collect(toSet());
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
        sb.append(this.contentOfMethodJavaDocComment(clazz, method, indent, mergeMode, candidates));
        sb.append(indent + "@Ignore(\"" + IGNORE_STATEMENT + "\")" + NL);
        sb.append(indent + "@Test" + NL);
        // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" + canonicalClassOf(clazz) + ", executable=\""
        // + method + "\", javadoc=\""
        // + javadocNameOf(clazz, method) + "\")" + NL);
        sb.append(indent + "@Category(" + simpleCanonicalClassOf(Draft.class) + ")" + NL);
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

    private String contentOfMethodJavaDocComment(final Class<?> clazz, final Method method, final String indent, final boolean mergeMode,
                                                 final Set<Class<?>> candidates) {
        final StringBuilder sb = new StringBuilder();
        if (mergeMode) {
            /*
             * [QUOTE] Duplicate default methods named test_toString with the parameters () and () are inherited from
             * the types ObjectTests<SUT> and CharSequenceTests<SUT> [/QUOTE]
             */
            sb.append(indent + "/**" + NL);
            sb.append(indent + " * <p>" + NL);
            sb.append(indent + " * The method-under-test covered by this test method is inherited duplicatedly within" + NL);
            sb.append(indent + " * the declaring class-under-test:</p>" + NL);
            sb.append(indent + " * <ul>" + NL);
            for (final Class<?> candidate : candidates) {
                sb.append(indent + " * <li>" + candidate + "</li>" + NL);
            }
            sb.append(indent + " * </ul>" + NL);
            sb.append(indent + " * " + NL);
            sb.append(indent + " * <p>In result, there are duplicated according test" + NL);
            sb.append(indent + " * method within the super test classes. To solve this situation, this method must be" + NL);
            sb.append(indent + " * overriden. Dont't worry, there will be meaningful test methods soon and, thus," + NL);
            sb.append(indent + " * overriding becomes unnecessary." + NL);
            sb.append(indent + " * </p>" + NL);
            sb.append(indent + " */" + NL);
        } else {
            sb.append(indent + "/**" + NL);
            sb.append(indent + " * <p>" + NL);
            sb.append(indent + " * Test method for {@link " + javadocNameOf(method) + " " + toVarArgAwareString(method) + "}." + NL);
            sb.append(indent + " *" + NL);
            sb.append(indent + " * Up to now, there is no real implementation of this test method. But with your help" + NL);
            sb.append(indent + " * at <a href=\"http://www.j8unit.org\">http://www.j8unit.org</a> this marker method will" + NL);
            sb.append(indent + " * be replaced by meaningful test methods soon." + NL);
            sb.append(indent + " * </p>" + NL);
            sb.append(indent + " *" + NL);
            sb.append(indent + " * @j8unit.aim " + javadocNameOf(clazz, method) + NL);
            sb.append(indent + " */" + NL);
        }
        return sb.toString();
    }

    protected void generateEveryJ8UnitTestClass(final GeneratorSetup testSetup)
    throws IOException {
        // determine all classes
        final Set<Class<?>> classes = listAllClasses(this.setup.originLocation, this.setup.pakkage);
        // generate test classes
        for (final Class<?> clazz : classes) {
            this.generateSpecificTestClass(clazz, INSTANCE, testSetup);
            this.generateSpecificTestClass(clazz, CLASS, testSetup);
        }
    }

    private void generateSpecificTestClass(final Class<?> clazz, final Membership membership, final GeneratorSetup testSetup)
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
                final File file = folder.resolve(this.setup.filenameForClass(clazz, membership)).toFile();
                if (file.createNewFile() || this.setup.isOverwriteMode()) {
                    LOG.info("Creating/Overwriting specific test class file for [" + clazz + "].");
                    try (final Writer writer = new FileWriter(file)) {
                        writer.write(content);
                    }
                } else {
                    LOG.info("Skipping creation of an already existing specific test class file for [" + clazz + "].");
                }
            }
            LOG.info(format(FINISHED, clazz));
        }
    }

    private String contentOfSpecificTestClass(final Class<?> clazz, final Membership membership, final GeneratorSetup testSetup) {
        LOG.info("Creating content of test class for [" + clazz + "] with membership [" + membership + "].");
        final String content = this.contentOfSpecificTestClass(clazz, membership, 0, testSetup);
        final StringBuilder sb = new StringBuilder();
        if (content.length() > 0) {
            sb.append(this.packageDeclaration(clazz));
            sb.append(this.imports(clazz));
            sb.append(content);
        }
        return sb.toString();
    }

    private String contentOfSpecificTestClass(final Class<?> clazz, final Membership membership, final int enclosingLevel, final GeneratorSetup testSetup) {
        LOG.info("Creating content of test class for [" + clazz + "] (membership = [" + membership + "].");
        final String content;
        if (clazz.isEnum() && INSTANCE.equals(membership)) {
            LOG.info("[" + clazz + "] is enum and the membership is [" + membership + "].");
            final @SuppressWarnings("unchecked") Class<? extends Enum<?>> eClazz = (Class<? extends Enum<?>>) clazz;
            content = this.contentOfSpecificEnumInstanceTestClass(eClazz, membership, enclosingLevel, testSetup);
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

    private String contentOfSpecificEnumInstanceTestClass(final Class<? extends Enum<?>> clazz, final Membership membership, final int enclosingLevel,
                                                          final GeneratorSetup testSetup) {
        final String indent = join("", nCopies(enclosingLevel, SPACE));
        final String nested = enclosingLevel > 0 ? "static " : "";
        final String testClassName = this.setup.simpleTestName(clazz, membership);
        final String sutSuper = canonicalNameWithTypeParametersNames(clazz, membership);
        final String testClassSuper2 = testSetup.getTestClassName(clazz, membership) //
                                       + "<" + sutSuper + ofEmptyable(typeParametersNamesOf(clazz)).prepend(",").orElse("") + ">";
        final StringBuilder sb = new StringBuilder();
        sb.append(indent + "@RunWith(J8Parameterized.class)" + NL);
        sb.append(indent + "@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)" + NL);
        sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(typeParametersDefinitionsOf(clazz)).surround("<", ">").orElse("") + NL);
        sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
        sb.append(NL);
        sb.append(indent + SPACE + "@Parameters(name = \"{index}: {0}\")" + NL);
        sb.append(indent + SPACE + "public static Iterable<Object[]> sutData() {" + NL);
        sb.append(indent + SPACE + SPACE + "return testParametersOfEnumClass(" + canonicalClassOf(clazz) + ");" + NL);
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
        final String testClassName = this.setup.simpleTestName(clazz, membership);
        final String sutSuper = canonicalNameWithTypeParametersNames(clazz, membership);
        final String testClassSuper2 = testSetup.getTestClassName(clazz, membership) //
                                       + "<" + sutSuper + ofEmptyable(typeParametersNamesOf(clazz)).prepend(",").orElse("") + ">";
        final String className = canonicalNameOf(clazz);

        Optional<Constructor<?>> constructor = Optional.empty();
        Optional<Constructor<?>> saveConstructor = Optional.empty();
        try {
            constructor = Stream.<Constructor<?>> of(clazz.getDeclaredConstructor()) //
                                .filter(PRIVATE::mismatches) //
                                .filter(this.setup::useConstructor) //
                                .findFirst();
            saveConstructor = constructor.filter(c -> stream(c.getExceptionTypes()).allMatch(RuntimeException.class::isAssignableFrom));
        } catch (NoSuchMethodException | SecurityException any) {}

        final Set<Field> collect = stream(clazz.getDeclaredFields()).filter(f -> Modifier.isStatic(f.getModifiers()))
                                                                    .filter(f -> Modifier.isPublic(f.getModifiers()))
                                                                    .filter(f -> clazz.isAssignableFrom(f.getType())).collect(toSet());
        final StringBuilder sb = new StringBuilder();

        if (!collect.isEmpty()) {
            sb.append(indent + "@RunWith(J8Parameterized.class)" + NL);
            sb.append(indent + "@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)" + NL);
            sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(typeParametersDefinitionsOf(clazz)).surround("<", ">").orElse("")
                      + NL);
            sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
            sb.append(NL);
            sb.append(indent + SPACE + "@Parameters(name = \"{index}: {0}\")" + NL);
            sb.append(indent + SPACE + "public static Iterable<Object[]> sutData() {" + NL);
            final String x = collect.stream().map(f -> canonicalNameOf(clazz) + "." + f.getName())
                                    .collect(joining(", //" + NL + indent + SPACE + SPACE + "                        ", "testParametersOf(", ")"));
            sb.append(indent + SPACE + SPACE + "return " + x + ";" + NL);
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
        } else if (saveConstructor.isPresent()) {
            sb.append(indent + "@RunWith(J8Unit4.class)" + NL);
            sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(typeParametersDefinitionsOf(clazz)).surround("<", ">").orElse("")
                      + NL);
            sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
            sb.append(NL);
            sb.append(indent + SPACE + "@Override" + NL);
            sb.append(indent + SPACE + "public " + sutSuper + " createNewSUT() {" + NL);
            sb.append(indent + SPACE + SPACE + "return new " + className + "();" + NL);
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
            sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(typeParametersDefinitionsOf(clazz)).surround("<", ">").orElse("")
                      + NL);
            sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
            sb.append(NL);
            sb.append(indent + SPACE + "@Override" + NL);
            sb.append(indent + SPACE + "public " + sutSuper + " createNewSUT() {" + NL);
            sb.append(indent + SPACE + "try {" + NL);
            sb.append(indent + SPACE + SPACE + "return new " + className + "();" + NL);
            sb.append(indent + SPACE + "} catch (final Exception cause) {" + NL);
            sb.append(indent + SPACE + SPACE + "throw new " + AssertionError.class.getSimpleName()
                      + "(\"Failed to create new subject-under-test instance!\", cause);" + NL);
            sb.append(indent + SPACE + "}" + NL);
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
            sb.append(indent + "public " + nested + "class " + testClassName + ofEmptyable(typeParametersDefinitionsOf(clazz)).surround("<", ">").orElse("")
                      + NL);
            sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
            sb.append(NL);
            sb.append(indent + SPACE + "@Override" + NL);
            sb.append(indent + SPACE + "public " + sutSuper + " createNewSUT() {" + NL);
            sb.append(indent + SPACE + SPACE + "throw new " + AssumptionViolatedException.class.getSimpleName() + "(\"There is no default constructor for ["
                      + className + "] available.\");" + NL);
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
        final String testClassName = this.setup.simpleTestName(clazz, membership);
        final String testClassSuper2 = testSetup.getTestClassName(clazz, membership) //
                                       + "<" + canonicalNameOf(clazz) + ">";
        final StringBuilder sb = new StringBuilder();
        sb.append(indent + "@RunWith(J8Unit4.class)" + NL);
        sb.append(ofEmptyable(typeParametersDefinitionsOf(clazz)).map(s -> indent + "@SuppressWarnings(\"rawtypes\")" + NL).orElse(""));
        sb.append(indent + "public " + nested + "class " + testClassName + NL);
        sb.append(indent + "implements " + testClassSuper2 + " {" + NL);
        sb.append(NL);
        sb.append(indent + SPACE + "@Override" + NL);
        sb.append(indent + SPACE + "public Class<" + canonicalNameOf(clazz) + "> createNewSUT() {" + NL);
        sb.append(indent + SPACE + SPACE + "return " + canonicalClassOf(clazz) + ";" + NL);
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

    /* * * * * * * * * * * * * * Source Code Fragments * * * * * * * * * * * * * */

    private String packageJavaDoc(final Package pakkage) {
        final StringBuilder sb = new StringBuilder();
        sb.append("/**" + NL);
        sb.append(" * <p>" + NL);
        sb.append(" * This package contains all the <strong>reusable tests</strong> targeting the behaviour of types of package {@code "
                  + canonicalNameOf(pakkage) + "}." + NL);
        sb.append(" * </p>" + NL);
        sb.append(" *" + NL);
        sb.append(" * <p>" + NL);
        sb.append(" * According to <a href=\"https://docs.oracle.com/javase/specs/jls/se8/html/jls-6.html#jls-6.1\">The Java Language" + NL);
        sb.append(" * Specification (Java SE 8 Edition), Section.&nbsp;6.1</a>, some package's &quot;[&hellip;] first identifier [&hellip;]" + NL);
        sb.append(" * should not be the identifier {@code java} [&hellip;]&quot;. Thus, this test class collection is limited to accessible" + NL);
        sb.append(" * classes (i.&thinsp;e., top-level, <a href=\"http://docs.oracle.com/javase/tutorial/java/javaOO/nested.html\">nested," + NL);
        sb.append(" * inner</a>), accessible methods, and accessible constructors&nbsp;&ndash; simply because it cannot place test classes" + NL);
        sb.append(" * in the class-under-test's {@code java.*} package (which otherwise would allow access to {@code protected}, resp." + NL);
        sb.append(" * <em>package-private</em> elements)." + NL);
        sb.append(" * </p>" + NL);
        sb.append(" *" + NL);
        sb.append(" * @since 0.9.0" + NL);
        sb.append(" * @author <a href=\"mailto:stefan@gasterstädt.de\">Stefan Gasterst&auml;dt</a>" + NL);
        sb.append(" * @author <a href=\"mailto:sascha.zak@zak-digital.de\">Sascha Zak</a>" + NL);
        sb.append(" */" + NL);
        return sb.toString();
    }

    private String packageDeclaration(final Package pakkage) {
        final StringBuilder sb = new StringBuilder();
        sb.append("package " + this.setup.packageForPackage(pakkage) + ";" + NL);
        sb.append(NL);
        return sb.toString();
    }

    private String packageDeclaration(final Class<?> clazz) {
        final StringBuilder sb = new StringBuilder();
        sb.append("package " + this.setup.packageForClass(clazz) + ";" + NL);
        sb.append(NL);
        return sb.toString();
    }

    private String imports(final Class<?> clazz) {
        final StringBuilder sb = new StringBuilder();
        sb.append("import static " + org.j8unit.util.TestParametersUtil.class.getName() + ".*;" + NL);
        sb.append("import static " + org.junit.Assert.class.getName() + ".*;" + NL);
        sb.append("import static " + org.junit.Assume.class.getName() + ".*;" + NL);
        sb.append("import static " + java.lang.reflect.Modifier.class.getName() + ".*;" + NL);
        sb.append("import " + java.lang.annotation.Annotation.class.getName() + ";" + NL);
        sb.append("import " + java.util.function.Supplier.class.getName() + ";" + NL);
        sb.append("import " + java.lang.reflect.Method.class.getName() + ";" + NL);
        sb.append("import " + java.lang.reflect.Constructor.class.getName() + ";" + NL);
        sb.append("import " + org.j8unit.FactoryBasedJ8UnitTest.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.j8unit.runners.J8Unit4.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.j8unit.repository.RepositoryTests.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.j8unit.repository.categories.J8UnitRepository.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.Test.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.runner.RunWith.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.runners.JUnit4.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.runners.Parameterized.class.getName() + ".Parameter;" + NL);
        sb.append("import " + org.junit.runners.Parameterized.class.getName() + ".Parameters;" + NL);
        sb.append("import " + org.junit.runners.Parameterized.class.getName() + ".UseParametersRunnerFactory;" + NL);
        sb.append("import " + org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParametersFactory.class.getPackage().getName() + ".*;" + NL);
        sb.append("import " + org.junit.experimental.categories.Category.class.getName() + ";" + NL);
        sb.append(NL);
        return sb.toString();
    }

    private String classJavaDoc(final Class<?> clazz, final Membership membership, final String indent) {
        final StringBuilder sb = new StringBuilder();
        switch (membership) {
            case CLASS:
                sb.append(indent + "/**" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * Reusable J8Unit test interface for {@linkplain " + canonicalNameOf(clazz) + " " + clazz + "}," + NL);
                sb.append(indent + " * containing all class relevant test methods (at least the test methods of accessible constructors and" + NL);
                sb.append(indent + " * of accessible {@code static} methods). The counterpart J8Unit test interface containing the instance" + NL);
                sb.append(indent + " * relevant test methods is {@link " + this.setup.getTestClassName(clazz, INSTANCE) + "}." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * In addition, there may be assertions concerning the class itself." + NL);
                sb.append(indent + " * For example, <a href=\"https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1\"><q>by" + NL);
                sb.append(indent + " * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type" + NL);
                sb.append(indent + " * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>)." + NL);
                sb.append(indent + " * Thus, {@link " + this.setup.getTestClassName(Annotation.class, membership) + "}" + NL);
                sb.append(indent + " * provides a corresponding, inheritable test method:" + NL);
                sb.append(indent + " * {@link " + this.setup.getTestClassName(Annotation.class, membership) + "#hasNoCustomParametrizedMethod()}." + NL);
                sb.append(indent + " * Similarly, this class is not only intended to assert some static method's behaviour but also to verify" + NL);
                sb.append(indent + " * runtime constraints and further class specific requirements." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @see " + this.setup.getTestClassName(clazz, INSTANCE) + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @param SUT the class' type of the subject-under-test" + NL);
                sb.append(indent + " * @since 0.9.0" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @j8unit.aim " + canonicalNameOf(clazz) + NL);
                sb.append(indent + " */" + NL);
                break;
            case INSTANCE:
                sb.append(indent + "/**" + NL);
                sb.append(indent + " * <p>" + NL);
                sb.append(indent + " * Reusable J8Unit test interface for {@linkplain " + canonicalNameOf(clazz) + " " + clazz + "}," + NL);
                sb.append(indent + " * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods)." + NL);
                sb.append(indent + " * The counterpart J8Unit test interface containing the class relevant test methods is " + NL);
                sb.append(indent + " * {@link " + this.setup.getTestClassName(clazz, INSTANCE) + "}." + NL);
                sb.append(indent + " * </p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @see " + this.setup.getTestClassName(clazz, CLASS) + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @param SUT the type of the subject-under-test" + NL);
                sb.append(indent + " * @since 0.9.0" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @j8unit.aim " + canonicalNameOf(clazz) + NL);
                sb.append(indent + " */" + NL);
                break;
        }
        return sb.toString();
    }

    private void appendCustomContent(final StringBuilder sb, final Class<?> clazz, final Membership membership, final String indent) {
        try {
            if (CLASS.equals(membership)) {
                final Method iaf = runtimed(() -> Class.class.getMethod("isAssignableFrom", Class.class));
                this.newBy092(sb, indent, clazz, iaf);
                sb.append(indent + "@" + Test.class.getSimpleName() + NL);
                // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" +
                // canonicalClassOf(iaf.getDeclaringClass()) + ", executable=\"" + iaf
                // + "\", javadoc=\"" + javadocNameOf(iaf) + "\")" + NL);
                sb.append(indent + "public default void testBaseTypeIsAssignableFromCurrentType() throws " + Exception.class.getSimpleName() + " {" + NL);
                sb.append(indent + SPACE + "// create new instance" + NL);
                sb.append(indent + SPACE + Class.class.getSimpleName() + "<SUT> sut = createNewSUT();" + NL);
                sb.append(indent + SPACE + "// assert assignability" + NL);
                sb.append(indent + SPACE + "assertTrue(" + canonicalClassOf(clazz) + "." + iaf.getName() + "(sut));" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
            }
            if (CLASS.equals(membership) && Enum.class.equals(clazz)) {
                this.newBy092(sb, indent, clazz);
                sb.append(indent + "@" + Test.class.getSimpleName() + NL);
                // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" + canonicalClassOf(clazz) + ",
                // javadoc=\""
                // + canonicalNameOf(clazz) + "\")" + NL);
                sb.append(indent + "public default void enumsMustContainImplicitilyDefinedValuesMethod()" + NL);
                sb.append(indent + "throws Exception {" + NL);
                sb.append(indent + SPACE + "final Class<SUT> sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE
                          + "assumeFalse(\"This general test method is not suitable for [\" + Enum.class.getName() + \"] itself.\", Enum.class.equals(sut));"
                          + NL);
                sb.append(indent + SPACE + "final Method method = sut.getMethod(\"values\");" + NL);
                sb.append(indent + SPACE + "assertNotNull(method);" + NL);
                sb.append(indent + SPACE + "assertTrue(method.getReturnType().isArray());" + NL);
                sb.append(indent + SPACE + "assertTrue(isStatic(method.getModifiers()));" + NL);
                sb.append(indent + SPACE + "final Object invocation = method.invoke(null);" + NL);
                sb.append(indent + SPACE + "assertNotNull(invocation);" + NL);
                sb.append(indent + SPACE + "assertTrue(invocation.getClass().isArray());" + NL);
                sb.append(indent + SPACE + "assertEquals(sut, invocation.getClass().getComponentType());" + NL);
                sb.append(indent + SPACE + "final @SuppressWarnings(\"unchecked\") SUT[] enums = (SUT[]) invocation;" + NL);
                sb.append(indent + SPACE + "assertArrayEquals(sut.getEnumConstants(), enums);" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
            }
            if (INSTANCE.equals(membership) && Enum.class.equals(clazz)) {
                this.newBy092(sb, indent, clazz, Enum.class.getMethod("getDeclaringClass"));
                sb.append(indent + "@" + Test.class.getSimpleName() + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Enum.class, executable=\"public final java.lang.Class
                // java.lang.Enum.getDeclaringClass()\", javadoc=\"java.lang.Enum#getDeclaringClass()\")"
                // + NL);
                sb.append(indent + "public default void getDeclaringClassMustBeAssignableFromGetClass() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "final Class<E> declaringClazz = sut.getDeclaringClass();" + NL);
                sb.append(indent + SPACE + "final Class<? extends Enum> clazz = sut.getClass();" + NL);
                sb.append(indent + SPACE + "assertTrue(declaringClazz.isAssignableFrom(clazz));" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Enum.class.getMethod("getDeclaringClass"));
                sb.append(indent + "@" + Test.class.getSimpleName() + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Enum.class, executable=\"public final java.lang.Class
                // java.lang.Enum.getDeclaringClass()\", javadoc=\"java.lang.Enum#getDeclaringClass()\")"
                // + NL);
                sb.append(indent + "public default void getDeclaringClassMustBeEnum() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "final Class<E> declaringClazz = sut.getDeclaringClass();" + NL);
                sb.append(indent + SPACE + "assertTrue(declaringClazz.isEnum());" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Enum.class.getMethod("ordinal"));
                sb.append(indent + "@" + Test.class.getSimpleName() + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Enum.class, executable=\"public final int java.lang.Enum.ordinal()\",
                // javadoc=\"java.lang.Enum#ordinal()\")"
                // + NL);
                sb.append(indent + "public default void ordinalMustBePositive()" + NL);
                sb.append(indent + "throws Exception {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assertTrue(sut.ordinal() >= 0);" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
            }
            if (INSTANCE.equals(membership) && Iterable.class.equals(clazz)) {
                this.newBy092(sb, indent, clazz, Iterable.class.getMethod("forEach", Consumer.class));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Iterable.class, executable=\"public default void
                // java.lang.Iterable.forEach(java.util.function.Consumer)\",
                // javadoc=\"java.lang.Iterable#forEach(java.util.function.Consumer)\")"
                // + NL);
                sb.append(indent + "@Category(TimeLinear.class)" + NL);
                sb.append(indent + "public default void forEachMustConsumeNOOP() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assumeTrue(\"The given Iterable is empty; Thus, this test becomes useless.\", sut.iterator().hasNext());" + NL);
                sb.append(indent + SPACE + "sut.forEach(e -> {});" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Iterable.class.getMethod("forEach", Consumer.class));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Iterable.class, executable=\"public default void
                // java.lang.Iterable.forEach(java.util.function.Consumer)\",
                // javadoc=\"java.lang.Iterable#forEach(java.util.function.Consumer)\")"
                // + NL);
                sb.append(indent + "public default void forEachMustRelayException() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assumeTrue(\"The given Iterable is empty; Thus, this test becomes useless.\", sut.iterator().hasNext());" + NL);
                sb.append(indent + SPACE + "final javax.xml.ws.Holder<Integer> counter = new javax.xml.ws.Holder<>(0);" + NL);
                sb.append(indent + SPACE + "try {" + NL);
                sb.append(indent + SPACE + "    sut.forEach(e -> {" + NL);
                sb.append(indent + SPACE + "        counter.value++;" + NL);
                sb.append(indent + SPACE + "        throw new UnsupportedOperationException(\"relayed exception\");" + NL);
                sb.append(indent + SPACE + "    });" + NL);
                sb.append(indent + SPACE + "    fail(\"Thrown exception has been suppressed!\");" + NL);
                sb.append(indent + SPACE + "} catch (final UnsupportedOperationException relayed) {" + NL);
                sb.append(indent + SPACE + "    // check exception" + NL);
                sb.append(indent + SPACE + "    assertEquals(\"relayed exception\", relayed.getMessage());" + NL);
                sb.append(indent + SPACE + "    // check unique execution of consumer block" + NL);
                sb.append(indent + SPACE + "    assertEquals((Integer) 1, counter.value);" + NL);
                sb.append(indent + SPACE + "    return;" + NL);
                sb.append(indent + SPACE + "}" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Iterable.class.getMethod("forEach", Consumer.class));
                sb.append(indent + "@Test(expected = NullPointerException.class)" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Iterable.class, executable=\"public default void
                // java.lang.Iterable.forEach(java.util.function.Consumer)\",
                // javadoc=\"java.lang.Iterable#forEach(java.util.function.Consumer)\")"
                // + NL);
                sb.append(indent + "@Category(TimeLinear.class)" + NL);
                sb.append(indent + "public default void forEachOfNullMustCauseNPE() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "sut.forEach(null);" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                sb.append(indent + "@Test" + NL);
                sb.append(indent + "public default void iteratorMustReturnNotNull() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assertNotNull(sut.iterator());" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Iterable.class.getMethod("spliterator"));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Iterable.class, executable=\"public default java.util.Spliterator
                // java.lang.Iterable.spliterator()\", javadoc=\"java.lang.Iterable#spliterator()\")"
                // + NL);
                sb.append(indent + "public default void spliteratorMustReturnNotNull() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assertNotNull(sut.spliterator());" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
            }
            if (INSTANCE.equals(membership) && Class.class.equals(clazz)) {
                this.newBy092(sb, indent, clazz, Class.class.getMethod("getName"));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Class.class, executable=\"public java.lang.String
                // java.lang.Class.getName()\",
                // javadoc=\"java.lang.Class#getName()\")"
                // + NL);
                sb.append(indent + "public default void getNameMustBeNotNull() {" + NL);
                sb.append(indent + SPACE + "final Class<T> sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assertNotNull(sut.getName());" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Class.class.getMethod("getName"));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Class.class, executable=\"public java.lang.String
                // java.lang.Class.getName()\",
                // javadoc=\"java.lang.Class#getName()\")"
                // + NL);
                sb.append(indent + "public default void getNameMustBeSyntacticallyValidIdentifier() {" + NL);
                sb.append(indent + SPACE + "final Class<T> sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assumeTrue(\"The given Class represents a primitive type; Thus, this test becomes useless.\", sut.isPrimitive());"
                          + NL);
                sb.append(indent + SPACE + "assumeTrue(\"The given Class represents an array class; Thus, this test becomes useless.\", sut.isArray());" + NL);
                sb.append(indent + SPACE + "final String name = sut.getName();" + NL);
                sb.append(indent + SPACE + "assertTrue(javax.lang.model.SourceVersion.isIdentifier(name));" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
            }
            if (INSTANCE.equals(membership) && Object.class.equals(clazz)) {
                this.newBy092(sb, indent, clazz, Object.class.getMethod("equals", Object.class));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Object.class, executable=\"public boolean
                // java.lang.Object.equals(java.lang.Object)\", javadoc=\"java.lang.Object#equals(java.lang.Object)\")"
                // + NL);
                sb.append(indent + "@Category(Should.class)" + NL);
                sb.append(indent + "public default void equalsShouldBeReflexive() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assertTrue(sut.equals(sut));" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Object.class.getMethod("equals", Object.class));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Object.class, executable=\"public boolean
                // java.lang.Object.equals(java.lang.Object)\", javadoc=\"java.lang.Object#equals(java.lang.Object)\")"
                // + NL);
                sb.append(indent + "@Category(Should.class)" + NL);
                sb.append(indent + "public default void equalsShouldRefuseNull() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assertFalse(sut.equals(null));" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Object.class.getMethod("getClass"));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Object.class, executable=\"public final native java.lang.Class
                // java.lang.Object.getClass()\", javadoc=\"java.lang.Object#getClass()\")"
                // + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Class.class, executable=\"public native boolean
                // java.lang.Class.isInstance(java.lang.Object)\",
                // javadoc=\"java.lang.Class#isInstance(java.lang.Object)\")"
                // + NL);
                sb.append(indent + "public default void getClassMustMatchIsInstance() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "final Class<? extends Object> clazz = sut.getClass();" + NL);
                sb.append(indent + SPACE + "assert clazz != null;" + NL);
                sb.append(indent + SPACE + "assertTrue(clazz.isInstance(sut));" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Object.class.getMethod("getClass"));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Object.class, executable=\"public final native java.lang.Class
                // java.lang.Object.getClass()\", javadoc=\"java.lang.Object#getClass()\")"
                // + NL);
                sb.append(indent + "public default void getClassMustReturnNotNull() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assertNotNull(sut.getClass());" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                sb.append(indent + "/**" + NL);
                sb.append(indent + " * <p>According to the general contract of {@link Object#toString()}, it" + NL);
                sb.append(indent + " * <q>returns a string that \"textually represents\"</q> the object." + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * Thus, there is absolutely no reason why {@code null} could be returned. Especially because even a {@code null}" + NL);
                sb.append(indent + " * can be easily represented textually by {@link java.util.Objects#toString(Object)}.</p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * <p>And obviously, no however reached (problematic) inner state of an object is allowed to cause an exception while"
                          + NL);
                sb.append(indent + " * computing the textual representation. It instead should be represented accordingly.</p>" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @since 0.9.2" + NL);
                sb.append(indent + " *" + NL);
                sb.append(indent + " * @j8unit.aim " + javadocNameOf(Object.class.getMethod("toString")) + NL);
                sb.append(indent + " */" + NL);
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.lang.Object.class, executable=\"public java.lang.String
                // java.lang.Object.toString()\",
                // javadoc=\"java.lang.Object#toString()\")"
                // + NL);
                sb.append(indent + "public default void toStringMustReturnNotNull() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assertNotNull(sut.toString());" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
            }
            if (CLASS.equals(membership) && Annotation.class.equals(clazz)) {
                this.newBy092(sb, indent, Annotation.class);
                sb.append(indent + "@Test" + NL);
                // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" + canonicalClassOf(clazz) + ",
                // javadoc=\""
                // + canonicalNameOf(clazz) + "\")" + NL);
                sb.append(indent + "public default void declaredMethodsCannotHaveFormalParameters() {" + NL);
                sb.append(indent + SPACE + "final Class<SUT> sut = createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "final Method[] methods = sut.getDeclaredMethods();" + NL);
                sb.append(indent + SPACE + "assert methods != null;" + NL);
                sb.append(indent + SPACE + "for (final Method method : methods) {" + NL);
                sb.append(indent + SPACE + SPACE + "try {" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "assert origin != null;" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "continue;" + NL);
                sb.append(indent + SPACE + SPACE + "} catch (final NoSuchMethodException ignore) {" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "final Class<?>[] formals = method.getParameterTypes();" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "assert formals != null;" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "assertEquals(0, formals.length);" + NL);
                sb.append(indent + SPACE + SPACE + "}" + NL);
                sb.append(indent + SPACE + "}" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, Annotation.class);
                sb.append(indent + "@Test" + NL);
                // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" + canonicalClassOf(clazz) + ",
                // javadoc=\""
                // + canonicalNameOf(clazz) + "\")" + NL);
                sb.append(indent + "public default void declaredMethodsCannotHaveThrowsClause() {" + NL);
                sb.append(indent + SPACE + "final Class<SUT> sut = createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "final Method[] methods = sut.getDeclaredMethods();" + NL);
                sb.append(indent + SPACE + "assert methods != null;" + NL);
                sb.append(indent + SPACE + "for (final Method method : methods) {" + NL);
                sb.append(indent + SPACE + SPACE + "try {" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "assert origin != null;" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "continue;" + NL);
                sb.append(indent + SPACE + SPACE + "} catch (final NoSuchMethodException ignore) {" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "final Class<?>[] exceptions = method.getExceptionTypes();" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "assert exceptions != null;" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "assertEquals(0, exceptions.length);" + NL);
                sb.append(indent + SPACE + SPACE + "}" + NL);
                sb.append(indent + SPACE + "}" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, Annotation.class);
                sb.append(indent + "@Test" + NL);
                // sb.append(indent + "@" + Aim.class.getSimpleName() + "(clazz=" + canonicalClassOf(clazz) + ",
                // javadoc=\""
                // + canonicalNameOf(clazz) + "\")" + NL);
                sb.append(indent + "public default void declaredMethodsCannotHaveTypeParameters() {" + NL);
                sb.append(indent + SPACE + "final Class<SUT> sut = createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "final Method[] methods = sut.getDeclaredMethods();" + NL);
                sb.append(indent + SPACE + "assert methods != null;" + NL);
                sb.append(indent + SPACE + "for (final Method method : methods) {" + NL);
                sb.append(indent + SPACE + SPACE + "try {" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "assert origin != null;" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "continue;" + NL);
                sb.append(indent + SPACE + SPACE + "} catch (final NoSuchMethodException ignore) {" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "final java.lang.reflect.TypeVariable<Method>[] types = method.getTypeParameters();" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "assert types != null;" + NL);
                sb.append(indent + SPACE + SPACE + SPACE + "assertEquals(0, types.length);" + NL);
                sb.append(indent + SPACE + SPACE + "}" + NL);
                sb.append(indent + SPACE + "}" + NL);
                sb.append(indent + "}" + NL);
            }
            if (INSTANCE.equals(membership) && Collection.class.equals(clazz)) {
                this.newBy092(sb, indent, clazz, Collection.class.getMethod("iterator"), Collection.class.getMethod("isEmpty"));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract java.util.Iterator
                // java.util.Collection.iterator()\", javadoc=\"java.util.Collection#iterator()\")"
                // + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract boolean
                // java.util.Collection.isEmpty()\", javadoc=\"java.util.Collection#isEmpty()\")"
                // + NL);
                sb.append(indent + "public default void testIteratorAccordingToIsEmpty() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "final java.util.Iterator<E> iterator = sut.iterator();" + NL);
                sb.append(indent + SPACE + "if (sut.isEmpty()) {" + NL);
                sb.append(indent + SPACE + SPACE + "assertFalse(iterator.hasNext());" + NL);
                sb.append(indent + SPACE + "} else {" + NL);
                sb.append(indent + SPACE + SPACE + "assertTrue(iterator.hasNext());" + NL);
                sb.append(indent + SPACE + "}" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Collection.class.getMethod("size"));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract int
                // java.util.Collection.size()\",
                // javadoc=\"java.util.Collection#size()\")"
                // + NL);
                sb.append(indent + "public default void testNonNegativeSize() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "assertFalse(sut.size() < 0);" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Collection.class.getMethod("size"), Collection.class.getMethod("isEmpty"));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract int
                // java.util.Collection.size()\",
                // javadoc=\"java.util.Collection#size()\")"
                // + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract boolean
                // java.util.Collection.isEmpty()\", javadoc=\"java.util.Collection#isEmpty()\")"
                // + NL);
                sb.append(indent + "public default void testSizeAccordingToIsEmpty() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "if (sut.isEmpty()) {" + NL);
                sb.append(indent + SPACE + SPACE + "assertEquals(0, sut.size());" + NL);
                sb.append(indent + SPACE + "} else {" + NL);
                sb.append(indent + SPACE + SPACE + "assertNotEquals(0, sut.size());" + NL);
                sb.append(indent + SPACE + "}" + NL);
                sb.append(indent + "}" + NL);
                sb.append(NL);
                this.newBy092(sb, indent, clazz, Collection.class.getMethod("size"), Collection.class.getMethod("toArray"));
                sb.append(indent + "@Test" + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract int
                // java.util.Collection.size()\",
                // javadoc=\"java.util.Collection#size()\")"
                // + NL);
                // sb.append(indent
                // + "@Aim(clazz=java.util.Collection.class, executable=\"public abstract java.lang.Object[]
                // java.util.Collection.toArray()\", javadoc=\"java.util.Collection#toArray()\")"
                // + NL);
                sb.append(indent + "public default void testToArraySize() {" + NL);
                sb.append(indent + SPACE + "final SUT sut = this.createNewSUT();" + NL);
                sb.append(indent + SPACE + "assert sut != null;" + NL);
                sb.append(indent + SPACE + "final Object[] array = sut.toArray();" + NL);
                sb.append(indent + SPACE + "assertEquals(sut.size(), array.length);" + NL);
                sb.append(indent + "}" + NL);
            }
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void newBy092(final StringBuilder sb, final String indent, final Class<?> clazz, final Executable... execs) {
        sb.append(indent + "/**" + NL);
        sb.append(indent + " * @since 0.9.2" + NL);
        sb.append(indent + " *" + NL);
        for (final Executable exec : execs) {
            sb.append(indent + " * @j8unit.aim " + javadocNameOf(clazz, exec) + NL);
        }
        sb.append(indent + " */" + NL);
    }

    private void newBy092(final StringBuilder sb, final String indent, final Class<?> clazz) {
        sb.append(indent + "/**" + NL);
        sb.append(indent + " * @since 0.9.2" + NL);
        sb.append(indent + " *" + NL);
        sb.append(indent + " * @j8unit.aim " + canonicalNameOf(clazz) + NL);
        sb.append(indent + " */" + NL);
    }

}
