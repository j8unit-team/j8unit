package org.j8unit.tools;

import static java.lang.String.join;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.Collections.singleton;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.StreamSupport.stream;
import static javax.tools.JavaFileObject.Kind.CLASS;
import static javax.tools.StandardLocation.CLASS_PATH;
import static javax.tools.StandardLocation.PLATFORM_CLASS_PATH;
import static javax.tools.ToolProvider.getSystemJavaCompiler;
import static org.j8unit.tools.GeneratorAnalysis.arrayDimensionOf;
import static org.j8unit.tools.GeneratorAnalysis.baseComponentTypeOf;
import static org.j8unit.tools.NamingUtilities.JAVA_LANG;
import static org.j8unit.tools.NamingUtilities.simpleCanonicalNameOf;
import static org.j8unit.tools.TypeKind.TOP_LEVEL;
import static org.j8unit.tools.util.AccessLevel.PRIVATE;
import static org.j8unit.tools.util.AccessLevel.PUBLIC;
import static org.j8unit.tools.util.OptionalString.ofEmptyable;
import static org.j8unit.tools.util.Utilities.capFirst;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Stream;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;
import org.j8unit.tools.util.Utilities;

public final class GeneratorSetup {

    private final String originPackage;

    private final StandardLocation originLocation;

    public final Set<Class<?>> listAllTypes()
    throws IOException {
        final JavaFileManager manager = getSystemJavaCompiler().getStandardFileManager(null, null, null);
        final Iterable<JavaFileObject> files = manager.list(this.originLocation, this.originPackage, singleton(CLASS), true);
        final Stream<JavaFileObject> x = stream(files.spliterator(), false);
        final Stream<String> names = x.map(file -> manager.inferBinaryName(this.originLocation, file));
        final Stream<Class<?>> classes = names.map(Utilities::tryLoadClass).flatMap(Utilities::toStream);
        return classes.collect(toSet());
    }

    private final String targetFolder;

    /**
     * Complete target folder for a given {@link Package}.
     */
    public final Path folderForPackage(final Package pakkage) {
        requireNonNull(pakkage);
        return Paths.get(this.targetFolder, this.packageForPackage(pakkage).split("\\.")).normalize();
    }

    /**
     * Complete target folder for a given {@link Class}' package.
     */
    public final Path folderForClass(final Class<?> clazz) {
        requireNonNull(clazz);
        return this.folderForPackage(clazz.getPackage());
    }

    private final String parentPackage;

    /**
     * Complete target package name for a given {@link Package}.
     */
    public final String packageForPackage(final Package pakkage) {
        requireNonNull(pakkage);
        if (this.parentPackage.isEmpty()) {
            return pakkage.getName();
        } else {
            return this.parentPackage + ofEmptyable(pakkage.getName()).prepend(".").orElse("");
        }
    }

    /**
     * Complete target package name for a given {@link Class}' package.
     */
    public final String packageForClass(final Class<?> clazz) {
        requireNonNull(clazz);
        return this.packageForPackage(clazz.getPackage());
    }

    private final String testClassPrefix;

    private final Boolean testClassInfixUpperCase;

    private final String testClassSuffix;

    public final String verySimpleCanonicalTestNameOf(final Class<?> clazz) {
        requireNonNull(clazz);
        if (clazz.isArray()) {
            throw new IllegalArgumentException("Array types cannot be mapped to an according simple canonical test class name!");
        } else if (clazz.isPrimitive()) {
            throw new IllegalArgumentException("Primitive types cannot be mapped to an according simple canonical test class name!");
        } else {
            final String infix = simpleCanonicalNameOf(clazz);
            return this.testClassPrefix + (this.testClassInfixUpperCase ? capFirst(infix) : infix) + this.testClassSuffix;
        }
    }

    public final String verySimpleCanonicalTestClassOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return this.verySimpleCanonicalTestNameOf(clazz) + ".class";
    }

    public final String simpleCanonicalTestNameOf(final Class<?> clazz) {
        requireNonNull(clazz);
        if (clazz.isArray()) {
            throw new IllegalArgumentException("Array types cannot be mapped to an according simple canonical test class name!");
        } else if (clazz.isPrimitive()) {
            throw new IllegalArgumentException("Primitive types cannot be mapped to an according simple canonical test class name!");
        } else if (TOP_LEVEL.matches(clazz)) {
            final String infix = simpleCanonicalNameOf(clazz);
            return this.testClassPrefix + (this.testClassInfixUpperCase ? capFirst(infix) : infix) + this.testClassSuffix;
        } else {
            final String infix = simpleCanonicalNameOf(clazz);
            return this.simpleCanonicalTestNameOf(clazz.getEnclosingClass()) + "." + this.testClassPrefix
                   + (this.testClassInfixUpperCase ? capFirst(infix) : infix) + this.testClassSuffix;
        }
    }

    public final String simpleCanonicalTestClassOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return this.simpleCanonicalTestNameOf(clazz) + ".class";
    }

    public final String canonicalTestNameOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return this.canonicalTestNameOf(clazz, JAVA_LANG);
    }

    public final String canonicalTestNameOf(final Class<?> clazz, final Class<?> reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return this.canonicalTestNameOf(clazz, reference.getPackage());
    }

    public final String canonicalTestNameOf(final Class<?> clazz, final Package reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return this.canonicalTestNameOf(clazz, reference.getName());
    }

    public final String canonicalTestNameOf(final Class<?> clazz, final String reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        if (clazz.isArray()) {
            throw new IllegalArgumentException("Array types cannot be mapped to an according canonical test class name!");
        } else if (clazz.isPrimitive()) {
            throw new IllegalArgumentException("Primitive types cannot be mapped to an according canonical test class name!");
        } else {
            final String currentNS = ofNullable(baseComponentTypeOf(clazz).getPackage()).map(Package::getName).orElse("");
            return reference.equals(currentNS) ? this.simpleCanonicalTestNameOf(clazz) : this.packageForClass(clazz) + "."
                                                                                         + this.simpleCanonicalTestNameOf(clazz);
        }
    }

    public final String canonicalTestClassOf(final Class<?> clazz, final Class<?> reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return this.canonicalTestClassOf(clazz, reference.getPackage());
    }

    public final String canonicalTestClassOf(final Class<?> clazz, final Package reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return this.canonicalTestClassOf(clazz, reference.getName());
    }

    public final String canonicalTestClassOf(final Class<?> clazz, final String reference) {
        requireNonNull(clazz);
        requireNonNull(reference);
        return this.canonicalTestNameOf(clazz, reference) + ".class";
    }

    private final String testConstructorPrefix;

    private final Boolean testConstructorInfixUpperCase;

    private final String testConstructorSuffix;

    /**
     * Simple target test method name for a given {@link Executable} (w/o declaring class).
     */
    public String getSimpleTestMethodName(final Constructor<?> constructor) {
        final String methodName = constructor.getDeclaringClass().getSimpleName();
        final Class<?>[] parameters = constructor.getParameterTypes();
        final String suffix = parameters.length > 0 ? stream(parameters).map(GeneratorSetup::getTestMethodInfixName).collect(joining("_", "_", "")) : "";
        return this.testConstructorPrefix + (this.testConstructorInfixUpperCase ? capFirst(methodName) : methodName) + suffix + this.testConstructorSuffix;
    }

    private final String testMethodPrefix;

    private final Boolean testMethodInfixUpperCase;

    private final String testMethodSuffix;

    /**
     * Simple target test method name for a given {@link Executable} (w/o declaring class).
     */
    public String getSimpleTestMethodName(final Method executable) {
        final String methodName = executable.getName();
        final Class<?>[] parameters = executable.getParameterTypes();
        final String suffix = parameters.length > 0 ? stream(parameters).map(GeneratorSetup::getTestMethodInfixName).collect(joining("_", "_", "")) : "";
        return this.testMethodPrefix + (this.testMethodInfixUpperCase ? capFirst(methodName) : methodName) + suffix + this.testMethodSuffix;
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

    private final Boolean publicClassesOnly;

    public final boolean useClass(final Class<?> clazz) {
        if (clazz == null) {
            return false;
        }
        return this.publicClassesOnly ? PUBLIC.matches(clazz) : PRIVATE.mismatches(clazz);
    }

    public final boolean skipClass(final Class<?> clazz) {
        return !this.useClass(clazz);
    }

    private final Boolean publicConstructorsOnly;

    public final boolean useConstructor(final Constructor<?> constructor) {
        if (constructor == null) {
            return false;
        }
        return this.publicConstructorsOnly ? PUBLIC.matches(constructor) : PRIVATE.mismatches(constructor);
    }

    public final boolean skipConstructor(final Constructor<?> constructor) {
        return !this.useConstructor(constructor);
    }

    private final Boolean publicMethodsOnly;

    public final boolean useMethod(final Method method) {
        if (method == null) {
            return false;
        }
        return this.publicMethodsOnly ? PUBLIC.matches(method) : PRIVATE.mismatches(method);
    }

    public final boolean skipMethod(final Method method) {
        return !this.useMethod(method);
    }

    private final Boolean publicFieldsOnly;

    public final boolean useField(final Field method) {
        if (method == null) {
            return false;
        }
        return this.publicFieldsOnly ? PUBLIC.matches(method) : PRIVATE.mismatches(method);
    }

    public final boolean skipField(final Field method) {
        return !this.useField(method);
    }

    private final Boolean overwriteMode;

    public final boolean isOverwriteMode() {
        return this.overwriteMode;
    }

    private GeneratorSetup(final Builder builder) {
        this.originPackage = requireNonNull(builder.originPackage);
        this.originLocation = requireNonNull(builder.originLocation);
        this.targetFolder = requireNonNull(builder.targetFolder);
        this.parentPackage = requireNonNull(builder.parentPackage);
        this.testClassPrefix = requireNonNull(builder.testClassPrefix);
        this.testClassInfixUpperCase = requireNonNull(builder.testClassInfixUpperCase);
        this.testClassSuffix = requireNonNull(builder.testClassSuffix);
        this.testConstructorPrefix = requireNonNull(builder.testConstructorPrefix);
        this.testConstructorInfixUpperCase = requireNonNull(builder.testConstructorInfixUpperCase);
        this.testConstructorSuffix = requireNonNull(builder.testConstructorSuffix);
        this.testMethodPrefix = requireNonNull(builder.testMethodPrefix);
        this.testMethodInfixUpperCase = requireNonNull(builder.testMethodInfixUpperCase);
        this.testMethodSuffix = requireNonNull(builder.testMethodSuffix);
        this.publicClassesOnly = requireNonNull(builder.publicClassesOnly);
        this.publicConstructorsOnly = requireNonNull(builder.publicConstructorsOnly);
        this.publicMethodsOnly = requireNonNull(builder.publicMethodsOnly);
        this.publicFieldsOnly = requireNonNull(builder.publicFieldsOnly);
        this.overwriteMode = requireNonNull(builder.overwriteMode);
    }

    /*
     * Builder section:
     */

    public final static Builder forPackage(final String packagePrefix) {
        requireNonNull(packagePrefix);
        return new Builder().forPackage(packagePrefix);
    }

    public final static Builder forJavaPackage(final String packagePrefix) {
        requireNonNull(packagePrefix);
        return new Builder().forJavaPackage(packagePrefix);
    }

    public final static Builder similarTo(final GeneratorSetup blueprint) {
        requireNonNull(blueprint);
        final Builder builder = new Builder();
        builder.originPackage = requireNonNull(blueprint.originPackage);
        builder.originLocation = requireNonNull(blueprint.originLocation);
        builder.targetFolder = requireNonNull(blueprint.targetFolder);
        builder.parentPackage = requireNonNull(blueprint.parentPackage);
        builder.testClassPrefix = requireNonNull(blueprint.testClassPrefix);
        builder.testClassInfixUpperCase = requireNonNull(blueprint.testClassInfixUpperCase);
        builder.testClassSuffix = requireNonNull(blueprint.testClassSuffix);
        builder.testConstructorPrefix = requireNonNull(blueprint.testConstructorPrefix);
        builder.testConstructorInfixUpperCase = requireNonNull(blueprint.testConstructorInfixUpperCase);
        builder.testConstructorSuffix = requireNonNull(blueprint.testConstructorSuffix);
        builder.testMethodPrefix = requireNonNull(blueprint.testMethodPrefix);
        builder.testMethodInfixUpperCase = requireNonNull(blueprint.testMethodInfixUpperCase);
        builder.testMethodSuffix = requireNonNull(blueprint.testMethodSuffix);
        builder.publicClassesOnly = requireNonNull(blueprint.publicClassesOnly);
        builder.publicConstructorsOnly = requireNonNull(blueprint.publicConstructorsOnly);
        builder.publicMethodsOnly = requireNonNull(blueprint.publicMethodsOnly);
        builder.publicFieldsOnly = requireNonNull(blueprint.publicFieldsOnly);
        builder.overwriteMode = requireNonNull(blueprint.overwriteMode);
        return builder;
    }

    public static final class Builder {

        private String originPackage = null;

        private StandardLocation originLocation = null;

        public final Builder forPackage(final String originPackage) {
            this.originPackage = requireNonNull(originPackage);
            this.originLocation = CLASS_PATH;
            return this;
        }

        public final Builder forJavaPackage(final String originPackage) {
            this.originPackage = requireNonNull(originPackage);
            this.originLocation = PLATFORM_CLASS_PATH;
            return this;
        }

        private String targetFolder = null;

        public final Builder intoTargetFolder(final String targetFolder) {
            this.targetFolder = requireNonNull(targetFolder);
            return this;
        }

        private String parentPackage = null;

        private Boolean publicClassesOnly = null;

        private Boolean publicConstructorsOnly = null;

        private Boolean publicMethodsOnly = null;

        private Boolean publicFieldsOnly = null;

        public final Builder asSubPackageOf(final String parentPackage) {
            this.parentPackage = requireNonNull(parentPackage);
            this.publicClassesOnly = this.publicConstructorsOnly = this.publicMethodsOnly = this.publicFieldsOnly = !parentPackage.isEmpty();
            return this;
        }

        private String testClassPrefix = null;

        public final Builder useTestClassPrefix(final String testClassPrefix) {
            this.testClassPrefix = requireNonNull(testClassPrefix);
            return this;
        }

        private Boolean testClassInfixUpperCase = null;

        public final Builder upperCaseTestClassInfix(final boolean upperCaseFlag) {
            this.testClassInfixUpperCase = upperCaseFlag;
            return this;
        }

        private String testClassSuffix = null;

        public final Builder useTestClassSuffix(final String testClassSuffix) {
            this.testClassSuffix = requireNonNull(testClassSuffix);
            return this;
        }

        private String testConstructorPrefix = null;

        public final Builder useTestConstructorPrefix(final String testConstructorPrefix) {
            this.testConstructorPrefix = requireNonNull(testConstructorPrefix);
            return this;
        }

        private Boolean testConstructorInfixUpperCase = null;

        public final Builder upperCaseTestConstructorInfix(final boolean upperCaseFlag) {
            this.testConstructorInfixUpperCase = upperCaseFlag;
            return this;
        }

        private String testConstructorSuffix = null;

        public final Builder useTestConstructorSuffix(final String testConstructorSuffix) {
            this.testConstructorSuffix = requireNonNull(testConstructorSuffix);
            return this;
        }

        private String testMethodPrefix = null;

        public final Builder useTestMethodPrefix(final String testMethodPrefix) {
            this.testMethodPrefix = requireNonNull(testMethodPrefix);
            return this;
        }

        private Boolean testMethodInfixUpperCase = null;

        public final Builder upperCaseTestMethodInfix(final boolean upperCaseFlag) {
            this.testMethodInfixUpperCase = upperCaseFlag;
            return this;
        }

        private String testMethodSuffix = null;

        public final Builder useTestMethodSuffix(final String testMethodSuffix) {
            this.testMethodSuffix = requireNonNull(testMethodSuffix);
            return this;
        }

        private Boolean overwriteMode = null;

        public final Builder overwriteExistingFiles() {
            this.overwriteMode = true;
            return this;
        }

        public final Builder skipExistingFiles() {
            this.overwriteMode = false;
            return this;
        }

        public final GeneratorSetup build() {
            return new GeneratorSetup(this);
        }

    }

}
