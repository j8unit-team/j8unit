package org.j8unit.tools;

import static java.lang.String.join;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.stream.Collectors.joining;
import static javax.tools.StandardLocation.CLASS_PATH;
import static javax.tools.StandardLocation.PLATFORM_CLASS_PATH;
import static org.j8unit.tools.AccessLevel.PUBLIC;
import static org.j8unit.tools.Utilities.capFirst;
import static org.j8unit.tools.Utilities.getBaseComponentType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Supplier;
import javax.tools.StandardLocation;

public class GeneratorSetup {

    public final String pakkage;

    public final StandardLocation originLocation;

    private final String targetPackagePrefix;

    private final boolean publicClassesOnly;

    private final boolean publicConstructorsOnly;

    private final boolean publicMethodsOnly;

    private final String instanceTestClassSuffix;

    private final String classTestClassSuffix;

    private final String testMethodPrefix;

    private final String testConstructorPrefix;

    private final String targetFolder;

    private final boolean capitalise;

    private final boolean overwriteMode;

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

    public boolean useClass(final Class<?> clazz) {
        if (clazz == null) {
            return false;
        }
        return !this.publicClassesOnly || PUBLIC.matches(clazz);
    }

    public boolean skipClass(final Class<?> clazz) {
        return !this.useClass(clazz);
    }

    public boolean useConstructor(final Constructor<?> constructor) {
        if (constructor == null) {
            return false;
        }
        return !this.publicConstructorsOnly || PUBLIC.matches(constructor);
    }

    public boolean useMethod(final Method method) {
        if (method == null) {
            return false;
        }
        return !this.publicMethodsOnly || PUBLIC.matches(method);
    }

    /**
     * Package prefix including ending {@code "."}.
     */
    public String getPackagePrefix() {
        return this.targetPackagePrefix.isEmpty() ? "" : (this.targetPackagePrefix.endsWith(".") ? this.targetPackagePrefix : this.targetPackagePrefix + ".");
    }

    /**
     * Complete target package name for a given {@link Package}.
     */
    public String packageForPackage(final Package pakkage) {
        return this.getPackagePrefix() + pakkage.getName();
    }

    /**
     * Complete target package name for a given {@link Class}' package.
     */
    public String packageForClass(final Class<?> clazz) {
        return this.packageForPackage(clazz.getPackage());
    }

    /**
     * Complete target folder for a given {@link Package}.
     */
    public Path folderForPackage(final Package pakkage) {
        return Paths.get(this.targetFolder, this.packageForPackage(pakkage).split("\\."));
    }

    /**
     * Complete target folder for a given {@link Class}' package.
     */
    public Path folderForClass(final Class<?> clazz) {
        return this.folderForPackage(clazz.getPackage());
    }

    /**
     * Simple source class name for a given {@link Class} (w/o package, resp. envelope class).
     */
    public static String getSimpleClassName(final Class<?> clazz) {
        return clazz.getSimpleName();
    }

    /**
     * Simple target test class name for a given {@link Class} (w/o package, resp. envelope class).
     */
    public String getSimpleTestClassName(final Class<?> clazz, final Membership membership) {
        switch (membership) {
            case CLASS:
                return clazz.getSimpleName() + this.classTestClassSuffix;
            case INSTANCE:
                return clazz.getSimpleName() + this.instanceTestClassSuffix;
        }
        throw new IllegalArgumentException();
    }

    /**
     * Source class name for a given {@link Class} (including package, resp. envelope class).
     */
    public static String getClassName(final Class<?> clazz) {
        if (ClassKind.TOP_LEVEL.matches(clazz)) {
            return clazz.getName();
        } else {
            return getClassName(clazz.getEnclosingClass()) + "." + getSimpleClassName(clazz);
        }
    }

    /**
     * Target test class name for a given {@link Class} (including package, resp. envelope class).
     */
    public String getTestClassName(final Class<?> clazz, final Membership membership) {
        if (ClassKind.TOP_LEVEL.matches(clazz)) {
            return this.packageForClass(clazz) + "." + this.getSimpleTestClassName(clazz, membership);
        } else {
            return this.getTestClassName(clazz.getEnclosingClass(), membership) + "." + this.getSimpleTestClassName(clazz, membership);
        }
    }

    /**
     * Target test class name for a given {@link Class} (including package, resp. envelope class).
     */
    public String getSpecificTestClassName(final Class<?> clazz, final Membership membership) {
        if (ClassKind.TOP_LEVEL.matches(clazz)) {
            return this.packageForClass(clazz) + "." + this.getSimpleTestClassName(clazz, membership);
        } else {
            return this.getSpecificTestClassName(clazz.getEnclosingClass(), membership) + "." + this.getSimpleTestClassName(clazz, membership);
        }
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

    private static final String getTestMethodInfixName(final Class<?> parameterClass) {
        if (parameterClass.isArray()) {
            return getTestMethodInfixName(getBaseComponentType(parameterClass)) + join("", nCopies(parameterClass.getName().lastIndexOf("[") + 1, "Array"));
        } else if (parameterClass.isPrimitive()) {
            return parameterClass.getName();
        } else {
            return parameterClass.getSimpleName();
        }
    }

    public boolean isOverwriteMode() {
        return this.overwriteMode;
    }

    /*
     * Builder section:
     */

    public static Builder similarTo(final GeneratorSetup setup) {
        final Builder builder = setup.originLocation.equals(PLATFORM_CLASS_PATH) ? new Builder().forJavaPackage(setup.pakkage) : new Builder().forPackage(setup.pakkage);
        builder.intoTargetFolder(setup.targetFolder) //
               .asSubPackageOf(setup.targetPackagePrefix) //
               .suffixForInstanceTestClass(setup.instanceTestClassSuffix)//
               .useTestMethodPrefix(setup.targetPackagePrefix)//
               .capitaliseMethodInfix(setup.capitalise)//
               .build();
        return builder;
    }

    public static Builder forPackage(final String originPackage) {
        return new Builder().forPackage(originPackage);
    }

    static Builder forJavaPackage(final String originPackage) {
        return new Builder().forJavaPackage(originPackage);
    }

    public static final class Builder
    implements Supplier<GeneratorSetup> {

        private String originPackage = "";

        private String targetFolder = "src/main/java";

        private StandardLocation originLocation = CLASS_PATH;

        private String parentPackage = "";

        private String instanceTestClassSuffix = "Tests";

        private String classTestClassSuffix = "ClassTests";

        private boolean publicClassesOnly, publicConstructorsOnly, publicMethodsOnly = false;

        private String testMethodPrefix = "test";

        private String testConstructorPrefix = "create";

        private boolean capitalise = true;

        private boolean overwriteMode = false;

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

        public Builder intoTargetFolder(final String targetFolder) {
            this.targetFolder = targetFolder;
            return this;
        }

        public Builder asSubPackageOf(final String parentPackage) {
            this.parentPackage = parentPackage;
            this.publicClassesOnly = this.publicConstructorsOnly = this.publicMethodsOnly = !parentPackage.isEmpty();
            return this;
        }

        public Builder suffixForInstanceTestClass(final String instanceTestClassSuffix) {
            this.instanceTestClassSuffix = instanceTestClassSuffix;
            return this;
        }

        public Builder suffixForClassTestClass(final String classTestClassSuffix) {
            this.classTestClassSuffix = classTestClassSuffix;
            return this;
        }

        public Builder useTestMethodPrefix(final String testMethodPrefix) {
            this.testMethodPrefix = testMethodPrefix;
            return this;
        }

        public Builder useTestConstructorPrefix(final String testConstructorPrefix) {
            this.testConstructorPrefix = testConstructorPrefix;
            return this;
        }

        public Builder capitaliseMethodInfix(final boolean capitalise) {
            this.capitalise = capitalise;
            return this;
        }

        public Builder overwriteExistingFiles(final boolean overwriteMode) {
            this.overwriteMode = overwriteMode;
            return this;
        }

        public GeneratorSetup build() {
            return this.get();
        }

        @Override
        public GeneratorSetup get() {
            return new GeneratorSetup(this.originPackage, this.originLocation, this.targetFolder, this.parentPackage, this.instanceTestClassSuffix,
                                      this.classTestClassSuffix, this.testConstructorPrefix, this.testMethodPrefix, this.publicClassesOnly,
                                      this.publicConstructorsOnly, this.publicMethodsOnly, this.capitalise, this.overwriteMode);
        }

    }

}
