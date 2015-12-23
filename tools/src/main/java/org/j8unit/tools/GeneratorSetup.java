package org.j8unit.tools;

import static java.lang.String.join;
import static java.lang.System.lineSeparator;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.Collections.singleton;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.StreamSupport.stream;
import static javax.tools.JavaFileObject.Kind.CLASS;
import static javax.tools.StandardLocation.CLASS_PATH;
import static javax.tools.StandardLocation.PLATFORM_CLASS_PATH;
import static javax.tools.ToolProvider.getSystemJavaCompiler;
import static org.j8unit.tools.AccessLevel.PUBLIC;
import static org.j8unit.tools.GeneratorUtil.capFirst;
import static org.j8unit.tools.GeneratorUtil.toStream;
import static org.j8unit.tools.OptionalString.ofEmptyable;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileManager.Location;
import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;

@SuppressWarnings("deprecation")
public class GeneratorSetup {

    public static final String NL = lineSeparator();

    public static final String SPACE = "    ";

    public static Builder forPackage(final String originPackage) {
        return new Builder().forPackage(originPackage);
    }

    public static Builder forJavaPackage(final String originPackage) {
        return new Builder().forJavaPackage(originPackage);
    }

    public static Builder similarTo(final GeneratorSetup setup) {
        final Builder builder = setup.originLocation.equals(PLATFORM_CLASS_PATH) ? new Builder().forJavaPackage(setup.pakkage) : new Builder().forPackage(setup.pakkage);
        builder.intoTargetFolder(setup.targetFolder) //
               .asSubPackageOf(setup.targetPackagePrefix) //
               .suffixForInstanceScopeTestClass(setup.instanceTestClassSuffix)//
               .suffixForClassScopeTestClass(setup.classTestClassSuffix) //
               .useTestMethodPrefix(setup.testMethodPrefix)//
               .useTestConstructorPrefix(setup.testConstructorPrefix) //
               .capitaliseMethodInfix(setup.capitalise)//
               .overwriteExistingFiles(setup.overwriteMode) //
               .build();
        return builder;
    }

    public static final class Builder
    implements Supplier<GeneratorSetup> {

        private boolean capitalise = true;

        private String classTestClassSuffix = "ClassTests";

        private String instanceTestClassSuffix = "Tests";

        private StandardLocation originLocation = CLASS_PATH;

        private String originPackage = "";

        private boolean overwriteMode = false;

        private String parentPackage = "";

        private boolean publicClassesOnly, publicConstructorsOnly, publicMethodsOnly = false;

        private String targetFolder = "src/main/java";

        private String testConstructorPrefix = "create";

        private String testMethodPrefix = "test";

        public Builder asSubPackageOf(final String parentPackage) {
            this.parentPackage = parentPackage;
            this.publicClassesOnly = this.publicConstructorsOnly = this.publicMethodsOnly = !parentPackage.isEmpty();
            return this;
        }

        public GeneratorSetup build() {
            return this.get();
        }

        public Builder capitaliseMethodInfix(final boolean capitalise) {
            this.capitalise = capitalise;
            return this;
        }

        Builder forJavaPackage(final String originPackage) {
            this.originPackage = originPackage;
            this.originLocation = PLATFORM_CLASS_PATH;
            return this;
        }

        public Builder forPackage(final String originPackage) {
            this.originPackage = originPackage;
            this.originLocation = CLASS_PATH;
            return this;
        }

        @Override
        public GeneratorSetup get() {
            return new GeneratorSetup(this.originPackage, this.originLocation, this.targetFolder, this.parentPackage, this.instanceTestClassSuffix,
                                      this.classTestClassSuffix, this.testConstructorPrefix, this.testMethodPrefix, this.publicClassesOnly,
                                      this.publicConstructorsOnly, this.publicMethodsOnly, this.capitalise, this.overwriteMode);
        }

        public Builder intoTargetFolder(final String targetFolder) {
            this.targetFolder = targetFolder;
            return this;
        }

        public Builder overwriteExistingFiles(final boolean overwriteMode) {
            this.overwriteMode = overwriteMode;
            return this;
        }

        public Builder suffixForClassScopeTestClass(final String classTestClassSuffix) {
            this.classTestClassSuffix = classTestClassSuffix;
            return this;
        }

        public Builder suffixForInstanceScopeTestClass(final String instanceTestClassSuffix) {
            this.instanceTestClassSuffix = instanceTestClassSuffix;
            return this;
        }

        public Builder useTestConstructorPrefix(final String testConstructorPrefix) {
            this.testConstructorPrefix = testConstructorPrefix;
            return this;
        }

        public Builder useTestMethodPrefix(final String testMethodPrefix) {
            this.testMethodPrefix = testMethodPrefix;
            return this;
        }

    }

    private final boolean capitalise;

    private final String classTestClassSuffix;

    private final String instanceTestClassSuffix;

    public final StandardLocation originLocation;

    private final boolean overwriteMode;

    public boolean isOverwriteMode() {
        return this.overwriteMode;
    }

    public final String pakkage;

    private final boolean publicClassesOnly;

    public boolean useClass(final Class<?> clazz) {
        if (clazz == null) {
            return false;
        }
        return !this.publicClassesOnly || PUBLIC.matches(clazz);
    }

    public boolean skipClass(final Class<?> clazz) {
        return !this.useClass(clazz);
    }

    private final boolean publicConstructorsOnly;

    public boolean useConstructor(final Constructor<?> constructor) {
        if (constructor == null) {
            return false;
        }
        return !this.publicConstructorsOnly || PUBLIC.matches(constructor);
    }

    private final boolean publicMethodsOnly;

    public boolean useMethod(final Method method) {
        if (method == null) {
            return false;
        }
        return !this.publicMethodsOnly || PUBLIC.matches(method);
    }

    private final String targetFolder;

    private final String targetPackagePrefix;

    private final String testConstructorPrefix;

    private final String testMethodPrefix;

    private GeneratorSetup(final String pakkage, final StandardLocation loc, final String targetFolder, final String prefix,
                           final String instanceTestClassSuffix, final String classTestClassSuffix, final String testConstructorPrefix,
                           final String testMethodPrefix, final boolean publicClassesOnly, final boolean publicConstructorsOnly,
                           final boolean publicMethodsOnly, final boolean capitalise, final boolean overwriteMode) {
        this.pakkage = pakkage;
        this.originLocation = loc;
        this.targetFolder = targetFolder;
        this.targetPackagePrefix = prefix;
        this.instanceTestClassSuffix = instanceTestClassSuffix;
        this.classTestClassSuffix = classTestClassSuffix;
        this.testConstructorPrefix = testConstructorPrefix;
        this.testMethodPrefix = testMethodPrefix;
        this.publicClassesOnly = publicClassesOnly;
        this.publicConstructorsOnly = publicConstructorsOnly;
        this.publicMethodsOnly = publicMethodsOnly;
        this.capitalise = capitalise;
        this.overwriteMode = overwriteMode;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final GeneratorSetup other = (GeneratorSetup) obj;
        if (this.capitalise != other.capitalise) {
            return false;
        }
        if (this.classTestClassSuffix == null) {
            if (other.classTestClassSuffix != null) {
                return false;
            }
        } else if (!this.classTestClassSuffix.equals(other.classTestClassSuffix)) {
            return false;
        }
        if (this.instanceTestClassSuffix == null) {
            if (other.instanceTestClassSuffix != null) {
                return false;
            }
        } else if (!this.instanceTestClassSuffix.equals(other.instanceTestClassSuffix)) {
            return false;
        }
        if (this.originLocation != other.originLocation) {
            return false;
        }
        if (this.overwriteMode != other.overwriteMode) {
            return false;
        }
        if (this.pakkage == null) {
            if (other.pakkage != null) {
                return false;
            }
        } else if (!this.pakkage.equals(other.pakkage)) {
            return false;
        }
        if (this.publicClassesOnly != other.publicClassesOnly) {
            return false;
        }
        if (this.publicConstructorsOnly != other.publicConstructorsOnly) {
            return false;
        }
        if (this.publicMethodsOnly != other.publicMethodsOnly) {
            return false;
        }
        if (this.targetFolder == null) {
            if (other.targetFolder != null) {
                return false;
            }
        } else if (!this.targetFolder.equals(other.targetFolder)) {
            return false;
        }
        if (this.targetPackagePrefix == null) {
            if (other.targetPackagePrefix != null) {
                return false;
            }
        } else if (!this.targetPackagePrefix.equals(other.targetPackagePrefix)) {
            return false;
        }
        if (this.testConstructorPrefix == null) {
            if (other.testConstructorPrefix != null) {
                return false;
            }
        } else if (!this.testConstructorPrefix.equals(other.testConstructorPrefix)) {
            return false;
        }
        if (this.testMethodPrefix == null) {
            if (other.testMethodPrefix != null) {
                return false;
            }
        } else if (!this.testMethodPrefix.equals(other.testMethodPrefix)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + (this.capitalise ? 1231 : 1237);
        result = (prime * result) + ((this.classTestClassSuffix == null) ? 0 : this.classTestClassSuffix.hashCode());
        result = (prime * result) + ((this.instanceTestClassSuffix == null) ? 0 : this.instanceTestClassSuffix.hashCode());
        result = (prime * result) + ((this.originLocation == null) ? 0 : this.originLocation.hashCode());
        result = (prime * result) + (this.overwriteMode ? 1231 : 1237);
        result = (prime * result) + ((this.pakkage == null) ? 0 : this.pakkage.hashCode());
        result = (prime * result) + (this.publicClassesOnly ? 1231 : 1237);
        result = (prime * result) + (this.publicConstructorsOnly ? 1231 : 1237);
        result = (prime * result) + (this.publicMethodsOnly ? 1231 : 1237);
        result = (prime * result) + ((this.targetFolder == null) ? 0 : this.targetFolder.hashCode());
        result = (prime * result) + ((this.targetPackagePrefix == null) ? 0 : this.targetPackagePrefix.hashCode());
        result = (prime * result) + ((this.testConstructorPrefix == null) ? 0 : this.testConstructorPrefix.hashCode());
        result = (prime * result) + ((this.testMethodPrefix == null) ? 0 : this.testMethodPrefix.hashCode());
        return result;
    }

    /* VARIOUS REPRESENTATIONS of CLASSES, MEMBERS, FIELDS, etc. */

    /**
     * Recursively calls {@link Class#getComponentType()} as often as the temporary current class is still an array.
     * Returns the finally explored component type.
     *
     * In other words, this method returns the basic component type of any multi-dimensional array. If the input class
     * is not an array, this class will be returned immediately.
     *
     * @param clazz
     *            some {@link Class} to analyse
     * @return the base component type of the given {@link Class}
     */
    public static final Class<?> baseComponentTypeOf(final Class<?> clazz) {
        assert clazz != null;
        Class<?> baseCT = clazz;
        for (Class<?> ct = clazz.getComponentType(); ct != null; ct = ct.getComponentType()) {
            baseCT = ct;
        }
        return baseCT;
    }

    /**
     * Returns the array dimension of the given {@link Class}.
     *
     * @param clazz
     *            some {@link Class} to analyse
     * @return the array dimension of the given {@link Class}
     */
    public static final int arrayDimensionOf(final Class<?> clazz) {
        int dim = 0;
        for (Class<?> ct = clazz.getComponentType(); ct != null; ct = ct.getComponentType()) {
            dim++;
        }
        return dim;
    }

    public static final String canonicalNameOf(final Package pakkage) {
        assert pakkage != null;
        return pakkage.getName();
    }

    public static final String simpleCanonicalNameOf(final Class<?> clazz) {
        assert clazz != null;
        return clazz.getSimpleName();
    }

    /**
     * Returns the simple class for a given {@link Class} (w/o package, resp. envelope class).
     *
     * @param clazz
     *            some {@link Class} to inspect
     * @return simple class of the given {@link Class}
     */
    public static String simpleCanonicalClassOf(final Class<?> clazz) {
        assert clazz != null;
        return simpleCanonicalNameOf(clazz) + ".class";
    }

    public static final String canonicalNameOf(final Type type) {
        assert type != null;
        if (type instanceof Class) {
            // Class: Map.Entry --> java.util.Map.Entry
            // Type: Map.Entry --> java.util.Map$Entry
            return ((Class<?>) type).getCanonicalName();
        } else {
            return type.getTypeName();
        }
    }

    /**
     * Returns the class for a given {@link Class} (w/o package, resp. envelope class).
     *
     * @param clazz
     *            some {@link Class} to inspect
     * @return class of the given {@link Class}
     */
    public static String canonicalClassOf(final Class<?> clazz) {
        assert clazz != null;
        if (clazz == null) {
            return "";
        }
        return canonicalNameOf(clazz) + ".class";
    }

    private static final String toVararg(final String signature) {
        if (signature.contains("[]")) {
            return signature.substring(0, signature.lastIndexOf("[]")) + "..." + signature.substring(signature.lastIndexOf("[]") + 2, signature.length());
        } else {
            return signature;
        }
    }

    public static String javadocNameOf(final Executable executable) {
        assert executable != null;
        return javadocNameOf(executable.getDeclaringClass(), executable);
    }

    public static String javadocNameOf(final Class<?> clazz, final Executable executable) {
        assert clazz != null;
        assert executable != null;
        final String jdClass = canonicalNameOf(clazz);
        final String jdMethod = executable instanceof Constructor ? simpleCanonicalNameOf(executable.getDeclaringClass()) : executable.getName();
        final String jdParameters = stream(executable.getParameterTypes()).map(Class::getCanonicalName).collect(joining(", "));
        return jdClass + "#" + jdMethod + "(" + (executable.isVarArgs() ? toVararg(jdParameters) : jdParameters) + ")";
    }

    public static String typeParametersDefinitionsOf(final Class<?> clazz) {
        assert clazz != null;
        return Arrays.stream(clazz.getTypeParameters()) //
                     .map(tv -> tv.toString() //
                                + OptionalString.ofEmptyable(Arrays.stream(tv.getBounds()) //
                                                                   .filter(t -> !Object.class.equals(t)) //
                                                                   .map(GeneratorSetup::createTypeParameterStatementOf) //
                                                                   .collect(joining(", "))) //
                                                .prepend(" extends ") //
                                                .orElse("")) //
                     .collect(joining(", "));
    }

    public static String typeParametersNamesOf(final Class<?> clazz) {
        assert clazz != null;
        return stream(clazz.getTypeParameters()).map(TypeVariable::toString).collect(joining(", "));
    }

    private static String createTypeParameterStatementOf(final Type type) {
        assert type != null;
        if (type instanceof ParameterizedType) {
            final ParameterizedType pt = (ParameterizedType) type;
            return createTypeParameterStatementOf(pt.getRawType()) + "<"
                   + stream(pt.getActualTypeArguments()).map(GeneratorSetup::createTypeParameterStatementOf).collect(joining(", ")) + ">";
        } else if (type instanceof Class) {
            final Class<?> clazz = (Class<?>) type;
            // Class: Spliterator.OfPrimitive --> java.util.Spliterator.OfPrimitive
            // Type: Spliterator.OfPrimitive --> java.util.Spliterator$OfPrimitive
            return clazz.getCanonicalName();
        } else {
            return type.toString();
        }
    }

    public static String createTypeParametersUsage(final ParameterizedType type) {
        if (type == null) {
            return "";
        }
        return stream(type.getActualTypeArguments()).map(GeneratorSetup::createTypeParameterStatementOf).collect(joining(", "));
    }

    public static String createTypeParametersUsage(final Type type) {
        if (type == null) {
            return "";
        } else if (type instanceof ParameterizedType) {
            return createTypeParametersUsage((ParameterizedType) type);
        } else if (type instanceof Class) {
            return typeParametersNamesOf((Class<?>) type);
        } else {
            return "";
        }
    }

    public static final String classNameWithTypeParametersNamesOf(final Class<?> clazz) {
        if (clazz == null) {
            return "";
        }
        return clazz.getCanonicalName() + ofEmptyable(typeParametersNamesOf(clazz)).surround("<", ">").orElse("");
    }

    public static final String classNameWithTypeParametersDefinitionsOf(final Class<?> clazz) {
        if (clazz == null) {
            return "";
        }
        return clazz.getCanonicalName() + ofEmptyable(typeParametersDefinitionsOf(clazz)).surround("<", ">").orElse("");
    }

    public static final String canonicalNameWithTypeParametersNames(final Class<?> clazz, final Membership membership) {
        if (clazz == null) {
            return "";
        }
        final String tpUsage = stream(clazz.getTypeParameters()).map(TypeVariable::getName).collect(joining(", "));
        final String name = clazz.getCanonicalName() + (tpUsage.isEmpty() ? "" : "<" + tpUsage + ">");
        switch (membership) {
            case CLASS:
                return "java.lang.Class<? extends " + name + ">";
            case INSTANCE:
                return name;
        }
        assert false;
        return name;
    }

    public static final String classNameWithUnboundTypeParametersOf(final Class<?> clazz) {
        if (clazz == null) {
            return "";
        }
        final String tpUsage = stream(clazz.getTypeParameters()).map(t -> "?").collect(joining(", "));
        return clazz.getCanonicalName() + (tpUsage.isEmpty() ? "" : "<" + tpUsage + ">");
    }

    public static final String classNameWithUnboundTypeParametersOf(final Class<?> clazz, final Membership membership) {
        if (clazz == null) {
            return "";
        }
        final String tpUsage = stream(clazz.getTypeParameters()).map(t -> "?").collect(joining(", "));
        final String name = clazz.getCanonicalName() + (tpUsage.isEmpty() ? "" : "<" + tpUsage + ">");
        switch (membership) {
            case CLASS:
                return "Class<? extends " + name + ">";
            case INSTANCE:
                return name;
        }
        assert false;
        return name;
    }

    public static LinkedHashMap<Class<?>, Type> getInterfaces(final Class<?> clazz) {
        final LinkedHashMap<Class<?>, Type> interfaces = new LinkedHashMap<>();
        for (int i = 0; i < clazz.getInterfaces().length; i++) {
            interfaces.put(clazz.getInterfaces()[i], clazz.getGenericInterfaces()[i]);
        }
        return interfaces;
    }

    public static Optional<Class<?>> getNearestMergingClass(final Class<?> clazz, final Method method) {
        // no such method at all?
        if (!supportsSuchPublicMethod(clazz, method)) {
            return Optional.empty();
        }
        // override within the class itself?
        if (specifiesSuchPublicMethod(clazz, method)) {
            return Optional.of(clazz);
        }
        // inspect super classes/interfaces
        final Stream<Class<?>> superClass = toStream(ofNullable(clazz.getSuperclass()));
        final Stream<Class<?>> superInterfaces = stream(clazz.getInterfaces());
        final Set<Class<?>> collect = Stream.concat(superClass, superInterfaces) //
                                            .map(c -> getNearestMergingClass(c, method)) //
                                            .flatMap(GeneratorUtil::toStream) //
                                            .collect(toSet());
        assert !collect.isEmpty() : "Method is supported, is not specified immediately, but (strangely) is not found within class hierarchie!";
        if (collect.size() == 1) {
            // exactly one super specifying class/interface
            return Optional.of(collect.iterator().next());
        } else {
            // more than one super specifying class/interface causes this class to effectively specify the method (aka.
            // merge ambiguity)
            return Optional.of(clazz);
        }
    }

    private static final String getTestMethodInfixName(final Class<?> parameterClass) {
        if (parameterClass.isArray()) {
            return getTestMethodInfixName(baseComponentTypeOf(parameterClass)) + join("", nCopies(arrayDimensionOf(parameterClass), "Array"));
        } else if (parameterClass.isPrimitive()) {
            return parameterClass.getName();
        } else {
            return parameterClass.getSimpleName();
        }
    }

    public static final boolean isReallyDeclared(final Class<?> clazz, final Executable executable) {
        return executable.getDeclaringClass().equals(clazz) && !executable.isSynthetic();
    }

    /**
     * http://stackoverflow.com/questions/1713941/is-javax-tools-depends-on-jdk
     */
    public static final Set<Class<?>> listAllClasses(final Location loc, final String pck)
    throws IOException {
        final JavaFileManager manager = getSystemJavaCompiler().getStandardFileManager(null, null, null);
        final Iterable<JavaFileObject> files = manager.list(loc, pck, singleton(CLASS), true);
        final Stream<String> names = stream(files.spliterator(), false).map(file -> manager.inferBinaryName(loc, file));
        final Stream<Class<?>> classes = names.map(GeneratorUtil::tryLoadClass).flatMap(GeneratorUtil::toStream);
        return classes.collect(toSet());
    }

    public static void main(final String[] args) {
        System.out.println(createTypeParametersUsage(EnumMap.class));
        System.out.println(typeParametersNamesOf(EnumMap.class));
    }

    public static final boolean specifiesSuchPublicMethod(final Class<?> clazz, final Method method) {
        try {
            final Method m = clazz.getMethod(method.getName(), method.getParameterTypes());
            return isReallyDeclared(clazz, m);
        } catch (final NoSuchMethodException any) {
            return false;
        }
    }

    public static final boolean supportsSuchPublicMethod(final Class<?> clazz, final Method method) {
        try {
            clazz.getMethod(method.getName(), method.getParameterTypes());
            return true;
        } catch (final NoSuchMethodException any) {
            return false;
        }
    }

    public static final String toVarArgAwareString(final Executable executable) {
        return executable.isVarArgs() ? toVararg(executable.toString()) : executable.toString();
    }

    public String filenameForClass(final Class<?> clazz, final Membership membership) {
        return this.simpleTestName(clazz, membership) + ".java";
    }

    public String filenameForPackage(final Package pakkage) {
        return "package-info.java";
    }

    /**
     * Complete target folder for a given {@link Class}' package.
     */
    public Path folderForClass(final Class<?> clazz) {
        return this.folderForPackage(clazz.getPackage());
    }

    /**
     * Complete target folder for a given {@link Package}.
     */
    public Path folderForPackage(final Package pakkage) {
        return Paths.get(this.targetFolder, this.packageForPackage(pakkage).split("\\."));
    }

    /**
     * Package prefix including ending {@code "."}.
     */
    public String getPackagePrefix() {
        return this.targetPackagePrefix.isEmpty() ? "" : (this.targetPackagePrefix.endsWith(".") ? this.targetPackagePrefix : this.targetPackagePrefix + ".");
    }

    /**
     * Simple target test method name for a given {@link Executable} (w/o declaring class).
     */
    public String getSimpleTestMethodName(final Executable executable) {
        final String methodName = executable instanceof Constructor ? executable.getDeclaringClass().getSimpleName() : executable.getName();
        final Class<?>[] parameters = executable.getParameterTypes();
        final String suffix = parameters.length > 0 ? stream(parameters).map(GeneratorSetup::getTestMethodInfixName).collect(joining("_", "_", "")) : "";
        return (executable instanceof Constructor ? this.testConstructorPrefix : this.testMethodPrefix) + (this.capitalise ? capFirst(methodName) : methodName)
               + suffix;
    }

    /**
     * Target test class name for a given {@link Class} (including package, resp. envelope class).
     */
    public String getSpecificTestClassName(final Class<?> clazz, final Membership membership) {
        if (ClassKind.TOP_LEVEL.matches(clazz)) {
            return this.packageForClass(clazz) + "." + this.simpleTestName(clazz, membership);
        } else {
            return this.getSpecificTestClassName(clazz.getEnclosingClass(), membership) + "." + this.simpleTestName(clazz, membership);
        }
    }

    /**
     * Target test class name for a given {@link Class} (including package, resp. envelope class).
     */
    public String getTestClassName(final Class<?> clazz, final Membership membership) {
        if (ClassKind.TOP_LEVEL.matches(clazz)) {
            return this.packageForClass(clazz) + "." + this.simpleTestName(clazz, membership);
        } else {
            return this.getTestClassName(clazz.getEnclosingClass(), membership) + "." + this.simpleTestName(clazz, membership);
        }
    }

    /**
     * Complete target package name for a given {@link Class}' package.
     */
    public String packageForClass(final Class<?> clazz) {
        return this.packageForPackage(clazz.getPackage());
    }

    /*
     * Builder section:
     */

    /**
     * Complete target package name for a given {@link Package}.
     */
    public String packageForPackage(final Package pakkage) {
        return this.getPackagePrefix() + pakkage.getName();
    }

    /**
     * Simple target test class name for a given {@link Class} (w/o package, resp. envelope class).
     */
    public String simpleTestName(final Class<?> clazz, final Membership membership) {
        switch (membership) {
            case CLASS:
                return clazz.getSimpleName() + this.classTestClassSuffix;
            case INSTANCE:
                return clazz.getSimpleName() + this.instanceTestClassSuffix;
        }
        throw new IllegalArgumentException();
    }

    public static final boolean isRawGeneric(final Class<?> clazz) {
        final List<Class<?>> rawGenerics = Arrays.asList( // extends Collection[]
                                                          java.beans.beancontext.BeanContext.class,
                                                          // extends BeanContext
                                                          java.beans.beancontext.BeanContextServices.class,
                                                          // extends BeanContext
                                                          java.beans.beancontext.BeanContextSupport.class,
                                                          // extends BeanContextServices, BeanContextSupport
                                                          java.beans.beancontext.BeanContextServicesSupport.class,
                                                          // extends javax.swing.ListCellRenderer[]
                                                          javax.swing.plaf.basic.BasicComboBoxRenderer.class,
                                                          // extends BasicComboBoxRenderer
                                                          javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource.class,
                                                          // extends Iterator[]
                                                          javax.xml.stream.XMLEventReader.class,
                                                          // extends XMLEventReader
                                                          javax.xml.stream.util.EventReaderDelegate.class);
        return rawGenerics.contains(clazz);
    }

}
