package org.j8unit.generator.api;

import static java.lang.String.join;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.Collections.singleton;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static java.util.regex.Pattern.LITERAL;
import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.StreamSupport.stream;
import static javax.tools.JavaFileObject.Kind.CLASS;
import static javax.tools.StandardLocation.CLASS_PATH;
import static javax.tools.StandardLocation.PLATFORM_CLASS_PATH;
import static javax.tools.ToolProvider.getSystemJavaCompiler;
import static org.j8unit.generator.analysis.AccessLevel.API;
import static org.j8unit.generator.analysis.AccessLevel.MANUFACTURER;
import static org.j8unit.generator.util.Arrays.arrayAnalysisOf;
import static org.j8unit.generator.util.Java.JAVA_FILE_EXTENSION;
import static org.j8unit.generator.util.Java.JAVA_NAMESPACE_DELIMITER;
import static org.j8unit.generator.util.OptionalString.ofOptional;
import static org.j8unit.generator.util.Strings.capFirst;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;
import org.j8unit.generator.analysis.AccessLevel;
import org.j8unit.generator.api.control.GeneratorInputControler;
import org.j8unit.generator.api.control.GeneratorOutputControler;
import org.j8unit.generator.api.control.GeneratorUseControler;
import org.j8unit.generator.api.render.FancyOriginRenderer;
import org.j8unit.generator.api.render.FancyTargetRenderer;
import org.j8unit.generator.util.Optionals;
import org.j8unit.generator.util.TypeAnalysis;

/**
 * <em>Immutable</em> container class of all {@linkplain J8UnitCodeGenerator generator}-specific configuration data.
 */
public final class GeneratorSetup
implements GeneratorInputControler, GeneratorUseControler, GeneratorOutputControler, FancyOriginRenderer, FancyTargetRenderer {

    private ImportMemory memory = new ImportMemory();

    @Override
    public void setImportMemory(final ImportMemory memory) {
        this.memory = memory;
    }

    @Override
    public void resetImportMemory() {
        this.setImportMemory(new ImportMemory());
    }

    @Override
    public ImportMemory getImportMemory() {
        return this.memory;
    }

    /**
     * The name of the root Java {@linkplain Package package} to consider when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}.
     *
     * Iff {@link #subPackageRecursion} is set to {@code true}, all sub-packages will be considered too.
     *
     * @see #subPackageRecursion
     */
    private final String originRootPackage;

    /**
     * Flag to whether or not include all sub-packages of {@link #originRootPackage} when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}.
     */
    private final boolean subPackageRecursion;

    /**
     * The location to look for the origin Java {@linkplain Class types} when invoking {@link #exploreOriginTypes()}. In
     * most cases, the value should be {@link StandardLocation#CLASS_PATH}, since normally only custom classes will be
     * considered.
     *
     * (In case of the j8unit's repository (considering the Java JDK's/SDK's classes), the value will be
     * {@link StandardLocation#PLATFORM_CLASS_PATH} instead.)
     */
    private final StandardLocation originLocation;

    /**
     * Returns a {@linkplain Set set} of all Java {@linkplain Class types} according to {@link #originLocation},
     * {@link #originRootPackage}, and {@link #subPackageRecursion}.
     *
     * @return a set of all Java types according to {@link #originLocation}, {@link #originRootPackage}, and
     *         {@link #subPackageRecursion}
     * @throws MissingCompilerException
     *             if the currently running Java platform does not provide a Java programming language compiler
     * @throws IOException
     *             if an I/O error occurred
     */
    @Override
    public final Set<Class<?>> exploreOriginTypes()
    throws MissingCompilerException, IOException {
        // TODO: Can we use some ideas of {@link java.lang.invoke.AbstractValidatingLambdaMetafactory} (and sub-types)
        // to create an alternative way to explore classes without the need of {@link
        // ToolProvider#getSystemJavaCompiler()}?
        final JavaCompiler compiler = ofNullable(getSystemJavaCompiler()).orElseThrow(MissingCompilerException::new);
        final JavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        final Iterable<JavaFileObject> files = manager.list(this.originLocation, this.originRootPackage, singleton(CLASS), this.subPackageRecursion);
        final Stream<String> names = stream(files.spliterator(), false).map(file -> manager.inferBinaryName(this.originLocation, file));
        final Stream<Class<?>> classes = names.map(TypeAnalysis::tryLoadClass).flatMap(Optionals::toStream);
        return classes.collect(toSet());
    }

    /**
     * Returns a {@linkplain Set set} of all Java {@linkplain Class types} of the given {@linkplain Package package}
     * according to {@link #originLocation}, {@link #originRootPackage}, and {@link #subPackageRecursion}.
     *
     * @return a set of all Java types of the given package according to {@link #originLocation},
     *         {@link #originRootPackage}, and {@link #subPackageRecursion}
     * @throws MissingCompilerException
     *             if the currently running Java platform does not provide a Java programming language compiler
     * @throws IOException
     *             if an I/O error occurred
     */
    public final Set<Class<?>> exploreOriginTypes(final Package pakkage)
    throws MissingCompilerException, IOException {
        return this.exploreOriginTypes().stream() //
                   .filter(t -> pakkage.equals(t.getPackage())) //
                   .collect(toSet());
    }

    /**
     * Returns a {@linkplain Set set} of all Java {@linkplain Package packages} according to {@link #originLocation},
     * {@link #originRootPackage}, and {@link #subPackageRecursion}.
     *
     * @return a set of all Java packages according to {@link #originLocation}, {@link #originRootPackage}, and
     *         {@link #subPackageRecursion}
     * @throws MissingCompilerException
     *             if the currently running Java platform does not provide a Java programming language compiler
     * @throws IOException
     *             if an I/O error occurred
     */
    @Override
    public final Set<Package> exploreOriginPackages()
    throws MissingCompilerException, IOException {
        final Set<Class<?>> originTypes = this.exploreOriginTypes();
        return originTypes.stream().map(Class::getPackage).collect(toSet());
    }

    /**
     * The access level, used to filter out these components to be considered when generating some target code.
     */
    private final AccessLevel accessLevel;

    @Override
    public AccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    /**
     * The name of the root folder to put the generated sources into.
     */
    private final String targetRootFolder;

    /**
     * {@inheritDoc}
     *
     * <p>
     * In detail, the returned folder path bases on (1.) the {@linkplain #targetRootFolder target root folder} plus (2.)
     * the {@linkplain #targetParentPackage parent package} of generated test sources, and on (3.) the given origin
     * package.
     * </p>
     */
    @Override
    public final Path targetFolderFor(final Package pakkage) {
        if (pakkage == null) {
            return Paths.get(this.targetRootFolder);
        } else {
            final Pattern splitPattern = compile(JAVA_NAMESPACE_DELIMITER, LITERAL);
            final String packageName = ofOptional(this.targetPackageFor(pakkage)).orEmpty();
            return Paths.get(this.targetRootFolder, splitPattern.split(packageName)).toAbsolutePath().normalize();
        }
    }

    @Override
    public Path targetSuiteFor(final Package pakkage) {
        requireNonNull(pakkage);
        final Path folder = this.targetFolderFor(pakkage);
        final Path path = folder.resolve("APIConformanceTests" + JAVA_FILE_EXTENSION);
        return path;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * In detail, the returned file path bases on (1.) the {@linkplain #targetRootFolder target root folder} plus (2.)
     * the {@linkplain #targetParentPackage parent package} of generated test sources, on (3.) the package of the given
     * origin Java type, and on (4.) the {@link #targetBasicNameOf(Class) basic canonical test name} plus the Java file
     * suffix (i.&thinsp;e., {@value org.j8unit.generator.util.Java#JAVA_FILE_EXTENSION}).
     * </p>
     */
    @Override
    public final Path targetFileFor(final Class<?> type) {
        requireNonNull(type);
        final Path folder = this.targetFolderFor(type);
        final Path path = folder.resolve(this.targetBasicNameOf(type) + JAVA_FILE_EXTENSION);
        return path;
    }

    /**
     * The name of the target parent package any generated sources needs to be sub-packaged.
     */
    private final String targetParentPackage;

    /**
     * {@inheritDoc}
     *
     * <p>
     * In detail, the returned package name bases on (1.) the {@linkplain #targetParentPackage parent package} of
     * generated test sources and on (2.) the given origin package.
     * </p>
     */
    @Override
    public final Optional<String> targetPackageFor(final Package pakkage) {
        if (pakkage == null) {
            return Optional.empty();
        } else if (this.targetParentPackage.isEmpty()) {
            assert !pakkage.getName().isEmpty();
            return Optional.of(pakkage.getName());
        } else {
            assert !pakkage.getName().isEmpty();
            return Optional.of(this.targetParentPackage + JAVA_NAMESPACE_DELIMITER + pakkage.getName());
        }
    }

    /**
     * When generating the target simple name of a given origin Java {@linkplain Class type} (see
     * {@link #targetSimpleNameOf(Class)}), this is the required prefix.
     */
    private final String testClassPrefix;

    /**
     * When generating the target simple name of a given origin Java {@linkplain Class type} (see
     * {@link #targetSimpleNameOf(Class)}), this is the required suffix.
     */
    private final String testClassSuffix;

    /**
     * When generating the target simple name of a given origin Java {@linkplain Class type} (see
     * {@link #targetSimpleNameOf(Class)}), this is the required flag indicating an infix first-letter upper-case
     * conversion.
     */
    private final boolean testClassInfixUpperCase;

    @Override
    public final String targetSimpleNameOf(final Class<?> type) {
        requireNonNull(type);
        if (type.isArray()) {
            throw new IllegalArgumentException("Array types cannot be mapped to an according target simple name!");
        } else if (type.isPrimitive()) {
            throw new IllegalArgumentException("Primitive types cannot be mapped to an according target simple name!");
        } else {
            final String infix = this.originSimpleNameOf(type);
            return this.testClassPrefix + (this.testClassInfixUpperCase ? capFirst(infix) : infix) + this.testClassSuffix;
        }
    }

    /**
     * When generating the target simple name of a given origin {@linkplain Constructor constructor} (see
     * {@link #targetSimpleNameOf(Constructor)}) this is the required prefix.
     */
    private final String testConstructorPrefix;

    /**
     * When generating the target simple name of a given origin {@linkplain Constructor constructor} (see
     * {@link #targetSimpleNameOf(Constructor)}) this is the required suffix.
     */
    private final String testConstructorSuffix;

    /**
     * When generating the target simple name of a given origin {@linkplain Constructor constructor}(see
     * {@link #targetSimpleNameOf(Constructor)}) this is the required flag indicating an infix first-letter upper-case
     * conversion.
     */
    private final boolean testConstructorInfixUpperCase;

    @Override
    public String targetSimpleNameOf(final Constructor<?> constructor) {
        final String constructorName = constructor.getDeclaringClass().getSimpleName();
        final Class<?>[] parameters = constructor.getParameterTypes();
        final String suffix = parameters.length > 0 ? stream(parameters).map(GeneratorSetup::parameterTypeToInfixName).collect(joining("_", "_", "")) : "";
        return this.testConstructorPrefix + (this.testConstructorInfixUpperCase ? capFirst(constructorName) : constructorName) + suffix
               + this.testConstructorSuffix;
    }

    /**
     * When generating the target simple name of a given origin {@linkplain Method method} (see
     * {@link #targetSimpleNameOf(Method)}) this is the required prefix.
     */
    private final String testMethodPrefix;

    /**
     * When generating the target simple name of a given origin {@linkplain Method method} (see
     * {@link #targetSimpleNameOf(Method)}) this is the required suffix.
     */
    private final String testMethodSuffix;

    /**
     * When generating the target simple name of a given origin {@linkplain Method method}(see
     * {@link #targetSimpleNameOf(Method)}) this is the required flag indicating an infix first-letter upper-case
     * conversion.
     */
    private final boolean testMethodInfixUpperCase;

    @Override
    public String targetSimpleNameOf(final Method method) {
        final String methodName = method.getName();
        final Class<?>[] parameters = method.getParameterTypes();
        final String suffix = parameters.length > 0 ? stream(parameters).map(GeneratorSetup::parameterTypeToInfixName).collect(joining("_", "_", "")) : "";
        return this.testMethodPrefix + (this.testMethodInfixUpperCase ? capFirst(methodName) : methodName) + suffix + this.testMethodSuffix;
    }

    private static final String parameterTypeToInfixName(final Class<?> parameterType) {
        assert parameterType != null;
        if (parameterType.isArray()) {
            final Entry<Class<?>, Integer> analysis = arrayAnalysisOf(parameterType);
            final Class<?> baseType = analysis.getKey();
            final int dimension = analysis.getValue();
            return parameterTypeToInfixName(baseType) + join("", nCopies(dimension, ARRAY_INFIX));
        } else if (parameterType.isPrimitive()) {
            return parameterType.getName();
        } else {
            return parameterType.getSimpleName();
        }
    }

    /**
     * Flag to whether or not overwrite existing {@link Package package}'s
     * {@value org.j8unit.generator.util.Java#PACKAGE_INFO_FILENAME} files when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}.
     */
    private final boolean overwritePackageTargets;

    @Override
    public final boolean doOverwrite(final Package pakkage) {
        return this.overwritePackageTargets;
    }

    /**
     * Flag to whether or not overwrite existing {@link Class type}'s target files when
     * {@linkplain Generator#generateSourceFile(Class, GeneratorSetup, GeneratorSetup) generating test-code}.
     */
    private final boolean overwriteClassTargets;

    public static final String ARRAY_INFIX = "Array";

    @Override
    public final boolean doOverwrite(final Class<?> type) {
        return this.overwriteClassTargets;
    }

    /**
     * Protected constructor of this class. Takes every instance's value out of the given {@link Builder}.
     *
     * @param builder
     *            the source of all the data of the new instance
     */
    protected GeneratorSetup(final Builder builder) {
        requireNonNull(builder);
        this.originRootPackage = requireNonNull(builder.originRootPackage);
        this.subPackageRecursion = builder.subPackageRecursion;
        this.originLocation = requireNonNull(builder.originLocation);
        this.targetRootFolder = requireNonNull(builder.targetRootFolder);
        this.targetParentPackage = requireNonNull(builder.targetParentPackage);
        this.testClassPrefix = requireNonNull(builder.testClassPrefix);
        this.testClassInfixUpperCase = builder.testClassInfixUpperCase;
        this.testClassSuffix = requireNonNull(builder.testClassSuffix);
        this.testConstructorPrefix = requireNonNull(builder.testConstructorPrefix);
        this.testConstructorInfixUpperCase = builder.testConstructorInfixUpperCase;
        this.testConstructorSuffix = requireNonNull(builder.testConstructorSuffix);
        this.testMethodPrefix = requireNonNull(builder.testMethodPrefix);
        this.testMethodInfixUpperCase = builder.testMethodInfixUpperCase;
        this.testMethodSuffix = requireNonNull(builder.testMethodSuffix);
        this.accessLevel = requireNonNull(builder.accessLevel);
        this.overwritePackageTargets = builder.overwritePackageTargets;
        this.overwriteClassTargets = builder.overwriteClassTargets;
    }

    /*
     * Builder section:
     */

    /**
     * Returns a new {@link GeneratorSetup} {@linkplain Builder builder} for the given package (of custom classes).
     * Afterwards, any further behaviour must be configured by calling the according builder's configuration methods.
     *
     * @param pakkage
     *            the origin package
     * @return a new {@code GeneratorSetup} builder for the given package (of custom classes)
     *
     * @see #forJavaPackage(String)
     */
    public final static Builder forPackage(final String pakkage) {
        requireNonNull(pakkage);
        return new Builder().forPackage(pakkage);
    }

    /**
     * Returns a new {@link GeneratorSetup} {@linkplain Builder builder} for the given package (of Java JDK's/SDK's
     * classes). Afterwards, any further behaviour must be configured by calling the according builder's configuration
     * methods.
     *
     * @param pakkage
     *            the origin package
     * @return a new {@code GeneratorSetup} builder for the given package (of custom classes)
     *
     * @see #forPackage(String)
     */
    final static Builder forJavaPackage(final String pakkage) {
        requireNonNull(pakkage);
        return new Builder().forJavaPackage(pakkage);
    }

    /**
     * Returns a new {@link GeneratorSetup} {@linkplain Builder builder}, ready to build a new instance similar to the
     * given one. Nevertheless you can use any of the builder's configuration methods to customise the build result.
     *
     * @param blueprint
     *            the blueprint instance
     * @return a new {@code GeneratorSetup} builder
     */
    public final static Builder similarTo(final GeneratorSetup blueprint) {
        requireNonNull(blueprint);
        final Builder builder = new Builder();
        builder.originRootPackage = requireNonNull(blueprint.originRootPackage);
        builder.subPackageRecursion = blueprint.subPackageRecursion;
        builder.originLocation = requireNonNull(blueprint.originLocation);
        builder.targetRootFolder = requireNonNull(blueprint.targetRootFolder);
        builder.targetParentPackage = requireNonNull(blueprint.targetParentPackage);
        builder.testClassPrefix = requireNonNull(blueprint.testClassPrefix);
        builder.testClassInfixUpperCase = blueprint.testClassInfixUpperCase;
        builder.testClassSuffix = requireNonNull(blueprint.testClassSuffix);
        builder.testConstructorPrefix = requireNonNull(blueprint.testConstructorPrefix);
        builder.testConstructorInfixUpperCase = blueprint.testConstructorInfixUpperCase;
        builder.testConstructorSuffix = requireNonNull(blueprint.testConstructorSuffix);
        builder.testMethodPrefix = requireNonNull(blueprint.testMethodPrefix);
        builder.testMethodInfixUpperCase = blueprint.testMethodInfixUpperCase;
        builder.testMethodSuffix = requireNonNull(blueprint.testMethodSuffix);
        builder.accessLevel = requireNonNull(blueprint.accessLevel);
        builder.overwritePackageTargets = blueprint.overwritePackageTargets;
        builder.overwriteClassTargets = blueprint.overwriteClassTargets;
        return builder;
    }

    /**
     * The builder of new {@link GeneratorSetup} instances.
     */
    public static final class Builder {

        private Builder() {
        }

        /**
         * Builder's blueprint value for {@link GeneratorSetup#originRootPackage}.
         */
        private String originRootPackage = null;

        /**
         * Builder's blueprint value for {@link GeneratorSetup#subPackageRecursion}.
         */
        private boolean subPackageRecursion = true;

        /**
         * Builder's blueprint value for {@link GeneratorSetup#originLocation}.
         */
        private StandardLocation originLocation = null;

        /**
         * Prepares {@link #originRootPackage} (with given package name), {@link #subPackageRecursion} (with
         * {@code true}), and {@link #originLocation} (with {@code StandardLocation#CLASS_PATH}).
         *
         * @param pakkage
         *            name of the origin package
         * @return {@code this} builder instance for fluent API style
         */
        public final Builder forPackage(final String pakkage) {
            this.originRootPackage = requireNonNull(pakkage);
            this.subPackageRecursion = true;
            this.originLocation = CLASS_PATH;
            return this;
        }

        /**
         * Prepares {@link #originRootPackage} (with given package name), {@link #subPackageRecursion} (with
         * {@code true}), and {@link #originLocation} (with {@code StandardLocation#PLATFORM_CLASS_PATH}).
         *
         * @param pakkage
         *            name of the origin package
         * @return {@code this} builder instance for fluent API style
         */
        final Builder forJavaPackage(final String originPackage) {
            this.originRootPackage = requireNonNull(originPackage);
            this.subPackageRecursion = true;
            this.originLocation = PLATFORM_CLASS_PATH;
            return this;
        }

        /**
         * Builder's blueprint value for {@link GeneratorSetup#targetRootFolder}.
         */
        private String targetRootFolder = null;

        /**
         * Prepares {@link #targetRootFolder} (with given folder name).
         *
         * @param targetFolder
         *            name of the target folder
         * @return {@code this} builder instance for fluent API style
         */
        public final Builder intoTargetFolder(final String targetFolder) {
            this.targetRootFolder = requireNonNull(targetFolder);
            return this;
        }

        /**
         * Builder's blueprint value for {@link GeneratorSetup#targetParentPackage}.
         */
        private String targetParentPackage = null;

        private AccessLevel accessLevel = null;

        /**
         * Prepares {@link #targetParentPackage} (with given package name); Plus prepares {@link #accessLevel} with
         * {@link AccessLevel#API} if the given package name is <em>not</em> empty, resp. with
         * {@link AccessLevel#MANUFACTURER} if the if the given package name is empty.
         *
         * (<em>Note:</em> The reusable j8unit tests do not extend the type-under-test classes. Thus, they only can
         * access the API elements if the tests are located in a different package. If, otherwise, the target package
         * equals the origin package, the j8unit tests can access all elements that are accessible by the manufacturer
         * itself.)
         *
         * @param targetParentPackage
         *            name of the target parent package
         * @return {@code this} builder instance for fluent API style
         */
        public final Builder asSubPackageOf(final String targetParentPackage) {
            this.targetParentPackage = requireNonNull(targetParentPackage);
            this.accessLevel = targetParentPackage.isEmpty() ? MANUFACTURER : API;
            return this;
        }

        /**
         * Builder's blueprint value for {@link GeneratorSetup#testClassPrefix}.
         */
        private String testClassPrefix = null;

        /**
         * Builder's blueprint value for {@link GeneratorSetup#testClassInfixUpperCase}.
         */
        private boolean testClassInfixUpperCase = false;

        /**
         * Builder's blueprint value for {@link GeneratorSetup#testClassSuffix}.
         */
        private String testClassSuffix = null;

        public static final String NO_PREFIX = "";

        public static final String NO_SUFFIX = "";

        public static final boolean UPPER_CASING_ON = true;

        public static final boolean ORIGIN_NAME = false;

        /**
         * Prepares {@link #testClassPrefix} (with given prefix), {@link #testClassInfixUpperCase} (with given
         * upper-case flag), and {@link #testClassSuffix} (with given suffix).
         *
         * @param prefix
         *            the prefix when naming test classes
         * @param upperCaseFlag
         *            the infix upper-case flag when naming test classes
         * @param suffix
         *            the suffix when naming test classes
         * @return {@code this} builder instance for fluent API style
         */
        public final Builder doTestClassNamingWith(final String prefix, final boolean upperCaseFlag, final String suffix) {
            this.testClassPrefix = requireNonNull(prefix);
            this.testClassInfixUpperCase = upperCaseFlag;
            this.testClassSuffix = requireNonNull(suffix);
            return this;
        }

        /**
         * Builder's blueprint value for {@link GeneratorSetup#testConstructorPrefix}.
         */
        private String testConstructorPrefix = null;

        /**
         * Builder's blueprint value for {@link GeneratorSetup#testConstructorInfixUpperCase}.
         */
        private boolean testConstructorInfixUpperCase = false;

        /**
         * Builder's blueprint value for {@link GeneratorSetup#testConstructorSuffix}.
         */
        private String testConstructorSuffix = null;

        /**
         * Prepares {@link #testConstructorPrefix} (with given prefix), {@link #testConstructorInfixUpperCase} (with
         * given upper-case flag), and {@link #testConstructorSuffix} (with given suffix).
         *
         * @param prefix
         *            the prefix when naming constructor tests
         * @param upperCaseFlag
         *            the infix upper-case flag when naming constructor tests
         * @param suffix
         *            the suffix when naming constructor tests
         * @return {@code this} builder instance for fluent API style
         */
        public final Builder doTestConstructorNamingWith(final String prefix, final boolean upperCaseFlag, final String suffix) {
            this.testConstructorPrefix = requireNonNull(prefix);
            this.testConstructorInfixUpperCase = upperCaseFlag;
            this.testConstructorSuffix = requireNonNull(suffix);
            return this;
        }

        /**
         * Builder's blueprint value for {@link GeneratorSetup#testMethodPrefix}.
         */
        private String testMethodPrefix = null;

        /**
         * Builder's blueprint value for {@link GeneratorSetup#testMethodInfixUpperCase}.
         */
        private boolean testMethodInfixUpperCase = false;

        /**
         * Builder's blueprint value for {@link GeneratorSetup#testMethodSuffix}.
         */
        private String testMethodSuffix = null;

        /**
         * Prepares {@link #testMethodPrefix} (with given prefix), {@link #testMethodInfixUpperCase} (with given
         * upper-case flag), and {@link #testMethodSuffix} (with given suffix).
         *
         * @param testMethodPrefix
         *            the prefix when naming method tests
         * @param upperCaseFlag
         *            the infix upper-case flag when naming method tests
         * @param testMethodSuffix
         *            the suffix when naming method tests
         * @return {@code this} builder instance for fluent API style
         */
        public final Builder doTestMethodNamingWith(final String testMethodPrefix, final boolean upperCaseFlag, final String testMethodSuffix) {
            this.testMethodPrefix = requireNonNull(testMethodPrefix);
            this.testMethodInfixUpperCase = upperCaseFlag;
            this.testMethodSuffix = requireNonNull(testMethodSuffix);
            return this;
        }

        /**
         * Builder's blueprint value for {@link GeneratorSetup#overwritePackageTargets}.
         */
        private boolean overwritePackageTargets = true;

        /**
         * Builder's blueprint value for {@link GeneratorSetup#overwriteClassTargets}.
         */
        private boolean overwriteClassTargets;

        /**
         * Prepares {@link #overwritePackageTargets} and {@link #overwriteClassTargets}, each with {@code true}.
         *
         * @return {@code this} builder instance for fluent API style
         */
        public final Builder overwriteExistingFiles() {
            this.overwritePackageTargets = this.overwriteClassTargets = true;
            return this;
        }

        /**
         * Prepares {@link #overwritePackageTargets} and {@link #overwriteClassTargets}, each with {@code false}.
         *
         * @return {@code this} builder instance for fluent API style
         */
        public final Builder skipExistingFiles() {
            this.overwritePackageTargets = this.overwriteClassTargets = false;
            return this;
        }

        /**
         * Based on the current configuration, this builder creates a new {@link GeneratorSetup} instance.
         *
         * @return a new instance of {@code GeneratorSetup}
         * @throws IllegalStateException
         *             if {@code this} builder's configuration has not been completed
         */
        public final GeneratorSetup build()
        throws IllegalStateException {
            try {
                return new GeneratorSetup(this);
            } catch (final NullPointerException | IllegalArgumentException any) {
                throw new IllegalStateException("The builder is not configured correctly!", any);
            }
        }

    }

}
