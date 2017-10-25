package org.j8unit.generator.api;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import static org.j8unit.generator.J8UnitRepositoryGenerators.INSTANCE_TESTS;
import static org.j8unit.generator.J8UnitRepositoryGenerators.TYPE_TESTS;
import static org.j8unit.generator.J8UnitRepositoryTestGenerators.INSTANCE_TEST_EXECUTION;
import static org.j8unit.generator.J8UnitRepositoryTestGenerators.TYPE_TEST_EXECUTION;
import static org.j8unit.generator.api.GeneratorSetup.similarTo;
import static org.j8unit.generator.api.LoggingMessagesKeys.FINISH_GENERATOR;
import static org.j8unit.generator.api.LoggingMessagesKeys.LOGGING_MESSAGES_BUNDLE;
import static org.j8unit.generator.api.LoggingMessagesKeys.START_GENERATOR;
import static org.j8unit.generator.api.RepositoryPackageInfo.J8UNIT_REPOSITORY_PACKAGE_INFO;
import static org.j8unit.generator.api.SuiteRunners.APIConformanceRunner;
import static org.j8unit.generator.util.Logger.getLogger;
import static org.j8unit.generator.util.Logging.configureJavaLogging;
import java.io.IOException;
import java.util.List;
import org.j8unit.generator.GeneratorTokens;
import org.j8unit.generator.util.Logger;

public enum RepositoryApp {
    ;

    private static final Logger LOG = getLogger(RepositoryApp.class.getName(), LOGGING_MESSAGES_BUNDLE);

    public static final List<String> JAVA8_ROOT_PACKAGES = unmodifiableList(asList("java", "javax", "org"));

    public static final GeneratorSetup INSTANCE_TESTS_SETUP = GeneratorSetup.forJavaPackage("java") //
                                                                            .intoTargetFolder("./target/generated-j8unit/repository/src/main/java") //
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
                                                                           .intoTargetFolder("./target/generated-j8unit/repository/src/test/java") //
                                                                           .doTestClassNamingWith("", false, "Test") //
                                                                           .build();

    public static final GeneratorSetup TYPE_TEST_SETUP = GeneratorSetup.similarTo(INSTANCE_TEST_SETUP) //
                                                                       .doTestClassNamingWith("", false, "ClassTest") //
                                                                       .build();

    public static final GeneratorSetup API_CONFORMANCE_SUITE_SETUP = GeneratorSetup.similarTo(INSTANCE_TESTS_SETUP) //
                                                                                   .intoTargetFolder("./target/generated-j8unit/repository/src/test/java") //
                                                                                   .doTestClassNamingWith("", false, "Test") //
                                                                                   .build();

    public static void main(final String[] args)
    throws Exception {
        configureJavaLogging();

        GeneratorTokens.IGNORE_MESSAGE = RepositoryTokens.IGNORE_MESSAGE;
        GeneratorTokens.VERSION_REPO_INITIAL = RepositoryTokens.VERSION_REPO_INITIAL;
        GeneratorTokens.VERSION_REPO_UPDATE = RepositoryTokens.VERSION_REPO_UPDATE;

        for (final String root : RepositoryApp.JAVA8_ROOT_PACKAGES) {
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
            // J8Unit Repository's Execution (APIConformance)
            final GeneratorSetup apiConformanceSuiteSetup = similarTo(API_CONFORMANCE_SUITE_SETUP).forJavaPackage(root).build();
            LOG.info(START_GENERATOR, APIConformanceRunner, root);
            generateCode(APIConformanceRunner, apiConformanceSuiteSetup, instanceRepoSetup);
            LOG.info(FINISH_GENERATOR, APIConformanceRunner, root);
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

    private static void generateCode(final J8UnitSuiteCodeGenerator generator, final GeneratorSetup setup, final GeneratorSetup complementarySetup)
    throws IOException {
        for (final Package pakkage : setup.exploreOriginPackages()) {
            generator.generateSourceFile(setup.exploreOriginTypes(pakkage), setup, setup, complementarySetup);
        }
    }

}
