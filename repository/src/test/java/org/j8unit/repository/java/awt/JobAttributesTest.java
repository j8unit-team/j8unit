package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.JobAttributes;
import java.awt.JobAttributes.DefaultSelectionType;
import java.awt.JobAttributes.DestinationType;
import java.awt.JobAttributes.DialogType;
import java.awt.JobAttributes.MultipleDocumentHandlingType;
import java.awt.JobAttributes.SidesType;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JobAttributesTest
implements FactoryBasedJ8UnitTest<JobAttributes>, org.j8unit.repository.java.awt.JobAttributesTests<JobAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.JobAttributes]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JobAttributes::new);
    }

    @Parameter(0)
    public Callable<JobAttributes> sutFactory;

    @Override
    public Callable<JobAttributes> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.JobAttributes]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.JobAttributes]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class SidesTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.SidesTypeTests<SidesType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.JobAttributes$SidesType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(SidesType.TWO_SIDED_LONG_EDGE, //
                                                       SidesType.ONE_SIDED, //
                                                       SidesType.TWO_SIDED_SHORT_EDGE);
        }

        @Parameter(0)
        public SidesType sut;

        @Override
        public SidesType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.JobAttributes$SidesType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.JobAttributes$SidesType]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DialogTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.DialogTypeTests<DialogType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.JobAttributes$DialogType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(DialogType.NATIVE, //
                                                       DialogType.COMMON, //
                                                       DialogType.NONE);
        }

        @Parameter(0)
        public DialogType sut;

        @Override
        public DialogType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.JobAttributes$DialogType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.JobAttributes$DialogType]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DestinationTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.DestinationTypeTests<DestinationType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.JobAttributes$DestinationType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(DestinationType.PRINTER, //
                                                       DestinationType.FILE);
        }

        @Parameter(0)
        public DestinationType sut;

        @Override
        public DestinationType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.JobAttributes$DestinationType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.JobAttributes$DestinationType]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MultipleDocumentHandlingTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.MultipleDocumentHandlingTypeTests<MultipleDocumentHandlingType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.JobAttributes$MultipleDocumentHandlingType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(MultipleDocumentHandlingType.SEPARATE_DOCUMENTS_COLLATED_COPIES, //
                                                       MultipleDocumentHandlingType.SEPARATE_DOCUMENTS_UNCOLLATED_COPIES);
        }

        @Parameter(0)
        public MultipleDocumentHandlingType sut;

        @Override
        public MultipleDocumentHandlingType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.JobAttributes$MultipleDocumentHandlingType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.JobAttributes$MultipleDocumentHandlingType]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DefaultSelectionTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.DefaultSelectionTypeTests<DefaultSelectionType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.JobAttributes$DefaultSelectionType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(DefaultSelectionType.ALL, //
                                                       DefaultSelectionType.RANGE, //
                                                       DefaultSelectionType.SELECTION);
        }

        @Parameter(0)
        public DefaultSelectionType sut;

        @Override
        public DefaultSelectionType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.JobAttributes$DefaultSelectionType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.JobAttributes$DefaultSelectionType]

    }

}
