package org.j8unit.generator.api;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.J8UnitRepositoryGenerators.INSTANCE_TESTS;
import static org.j8unit.generator.J8UnitRepositoryGenerators.TYPE_TESTS;
import static org.j8unit.generator.J8UnitRepositoryTestGenerators.INSTANCE_TEST_EXECUTION;
import static org.j8unit.generator.J8UnitRepositoryTestGenerators.TYPE_TEST_EXECUTION;
import static org.j8unit.generator.api.GeneratorSetup.similarTo;
import static org.j8unit.generator.api.J8UnitRepositoryGeneratorApp.PackageInfo.J8UNIT_REPOSITORY_PACKAGE_INFO;
import static org.j8unit.generator.api.LoggingMessagesKeys.FINISH_GENERATOR;
import static org.j8unit.generator.api.LoggingMessagesKeys.LOGGING_MESSAGES_BUNDLE;
import static org.j8unit.generator.api.LoggingMessagesKeys.START_GENERATOR;
import static org.j8unit.generator.api.RepositoryTokens.SASCHA_MAIL;
import static org.j8unit.generator.api.RepositoryTokens.SASCHA_NAME;
import static org.j8unit.generator.api.RepositoryTokens.STEFAN_MAIL;
import static org.j8unit.generator.api.RepositoryTokens.STEFAN_NAME;
import static org.j8unit.generator.api.RepositoryTokens.VERSION_REPO_INITIAL;
import static org.j8unit.generator.util.Logger.getLogger;
import static org.j8unit.generator.util.Logging.configureJavaLogging;
import java.io.IOException;
import java.util.List;
import org.j8unit.generator.GeneratorTokens;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.generator.util.Logger;
import org.j8unit.generator.util.OptionalString;

public enum J8UnitRepositoryGeneratorApp {
    ;

    private static final Logger LOG = getLogger(J8UnitRepositoryGeneratorApp.class.getName(), LOGGING_MESSAGES_BUNDLE);

    public static final List<String> JAVA8_ROOT_PACKAGES = unmodifiableList(asList("java", "javax", "org"));

    public static final GeneratorSetup INSTANCE_TESTS_SETUP = GeneratorSetup.forJavaPackage("java") //
                                                                            .intoTargetFolder("../repository/src/main/java") //
                                                                            .asSubPackageOf("org.j8unit.repository") //
                                                                            .doTestClassNamingWith("", false, "Tests") //
                                                                            .doTestConstructorNamingWith("create_", false, "") //
                                                                            .doTestMethodNamingWith("test_", false, "") //
                                                                            .overwriteExistingFiles() //
                                                                            .build();

    public static final GeneratorSetup TYPE_TESTS_SETUP = GeneratorSetup.similarTo(INSTANCE_TESTS_SETUP) //
                                                                        .doTestClassNamingWith("", false, "ClassTests") //
                                                                        .build();

    public static final GeneratorSetup INSTANCE_TEST_SETUP = GeneratorSetup.similarTo(INSTANCE_TESTS_SETUP) //
                                                                           .intoTargetFolder("../repository/src/test/java") //
                                                                           .doTestClassNamingWith("", false, "Test") //
                                                                           .build();

    public static final GeneratorSetup TYPE_TEST_SETUP = GeneratorSetup.similarTo(INSTANCE_TEST_SETUP) //
                                                                       .doTestClassNamingWith("", false, "ClassTest") //
                                                                       .build();

    public static void main(final String[] args)
    throws Exception {
        configureJavaLogging();

        GeneratorTokens.IGNORE_MESSAGE = RepositoryTokens.IGNORE_MESSAGE;
        GeneratorTokens.VERSION_REPO_INITIAL = RepositoryTokens.VERSION_REPO_INITIAL;
        GeneratorTokens.VERSION_REPO_UPDATE = RepositoryTokens.VERSION_REPO_UPDATE;

        for (final String root : J8UnitRepositoryGeneratorApp.JAVA8_ROOT_PACKAGES) {
            // Package Info
            final GeneratorSetup packageInfoSetup = similarTo(INSTANCE_TESTS_SETUP).forJavaPackage(root).build();
            LOG.info(START_GENERATOR, J8UNIT_REPOSITORY_PACKAGE_INFO, root);
            generatePackageInfo(J8UNIT_REPOSITORY_PACKAGE_INFO, packageInfoSetup);
            LOG.info(FINISH_GENERATOR, J8UNIT_REPOSITORY_PACKAGE_INFO, root);

            // J8Unit Repository
            final GeneratorSetup instanceRepoSetup = similarTo(INSTANCE_TESTS_SETUP).forJavaPackage(root).build();
            final GeneratorSetup typeRepoSetup = similarTo(TYPE_TESTS_SETUP).forJavaPackage(root).build();
            LOG.info(START_GENERATOR, INSTANCE_TESTS, root);
            generateCode(INSTANCE_TESTS, instanceRepoSetup, typeRepoSetup);
            LOG.info(FINISH_GENERATOR, INSTANCE_TESTS, root);
            LOG.info(START_GENERATOR, TYPE_TESTS, root);
            generateCode(TYPE_TESTS, typeRepoSetup, instanceRepoSetup);
            LOG.info(FINISH_GENERATOR, TYPE_TESTS, root);

            // J8Unit Repository's Execution
            final GeneratorSetup instanceTestSetup = similarTo(INSTANCE_TEST_SETUP).forJavaPackage(root).build();
            LOG.info(START_GENERATOR, INSTANCE_TEST_EXECUTION, root);
            generateCode(INSTANCE_TEST_EXECUTION, instanceTestSetup, instanceRepoSetup);
            LOG.info(FINISH_GENERATOR, INSTANCE_TEST_EXECUTION, root);
            final GeneratorSetup typeTestSetup = similarTo(TYPE_TEST_SETUP).forJavaPackage(root).build();
            LOG.info(START_GENERATOR, TYPE_TEST_EXECUTION, root);
            generateCode(TYPE_TEST_EXECUTION, typeTestSetup, typeRepoSetup);
            LOG.info(FINISH_GENERATOR, TYPE_TEST_EXECUTION, root);
        }
    }

    private static void generatePackageInfo(final PackageInfoGenerator generator, final GeneratorSetup setup)
    throws IOException {
        setup.exploreOriginPackages().forEach(p -> generator.generatePackageInfoFile(p, setup, setup));
    }

    private static void generateCode(final J8UnitCodeGenerator generator, final GeneratorSetup setup, final GeneratorSetup complementarySetup)
    throws IOException {
        setup.exploreOriginTypes().forEach(t -> generator.generateSourceFile(t, setup, setup, complementarySetup));
    }

    static enum PackageInfo
    implements PackageInfoGenerator {

        J8UNIT_REPOSITORY_PACKAGE_INFO {

            @Override
            public final String generateJavaDoc(final Package pakkage, final OriginRenderer renderer) {
                requireNonNull(pakkage);
                requireNonNull(renderer);
                final String reference = OptionalString.ofOptional(renderer.originPackageFor(pakkage)) //
                                                       .surround("package {@link ", "}") //
                                                       .orElse("the <em>default package</em>");
                // content storage
                final StringBuilder out = new StringBuilder();
                // content creation
                out.append(format("/**%n"));
                out.append(format(" * <p>%n"));
                out.append(format(" * This package is part of the j8unit repository and contains all <strong>reusable tests</strong> targeting the%n"));
                out.append(format(" * renderer of the types of %s.%n", reference));
                out.append(format(" *%n"));
                out.append(format(" * Because the j8unit repository first and foremost intends to provide reusable tests targeting the reusable API%n"));
                out.append(format(" * elements of the types of Java&thinsp;8, these tests cover the usable and extendable (i.&thinsp;e., {@code public})%n"));
                out.append(format(" * types and its usable and extendable (i.&thinsp;e., non-{@code static} {@code public}) methods.%n"));
                out.append(format(" * </p>%n"));
                out.append(format(" *%n"));
                switch (pakkage.getName().split("\\.")[0]) {
                    case "java":
                        // <p>
                        // According to <a
                        // href=\"https://docs.oracle.com/javase/specs/jls/se8/html/jls-6.html#jls-6.1\">The
                        // Java Language Specification (Java SE 8 Edition), Section.&nbsp;6.1</a>, some package's
                        // &quot;[&hellip;] first identifier [&hellip;] should not be the identifier {@code java}
                        // [&hellip;]&quot;. Thus, this test class collection is limited to accessible classes
                        // (i.&thinsp;e., top-level, <a
                        // href=\"http://docs.oracle.com/javase/tutorial/java/javaOO/nested.html\">nested, inner</a>)
                        // and
                        // accessible methods&nbsp;&ndash; simply because it cannot place test classes in the
                        // type-under-test's {@code java.*} package (which otherwise would allow access to {@code
                        // protected}, resp. <em>package-private</em> elements).
                        // </p>
                        break;
                }
                out.append(format(" * @since %s%n", VERSION_REPO_INITIAL));
                out.append(format(" * @author <a href=\"mailto:%s\">%s</a>%n", STEFAN_MAIL, STEFAN_NAME));
                out.append(format(" * @author <a href=\"mailto:%s\">%s</a>%n", SASCHA_MAIL, SASCHA_NAME));
                out.append(format(" */%n"));
                // finalize content
                return out.toString();
            }

        };

        /**
         * Returns a programmer-friendly textually representation of {@code this} j8unit generator.
         */
        @Override
        public final String toString() {
            return format("%s::%s", this.getDeclaringClass().getName(), this.name());
        }

    }

}
