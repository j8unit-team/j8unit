package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class JobAttributesTest
implements org.j8unit.repository.java.awt.JobAttributesTests<java.awt.JobAttributes> {

    @Override
    public java.awt.JobAttributes createNewSUT() {
        return new java.awt.JobAttributes();
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MultipleDocumentHandlingTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.MultipleDocumentHandlingTypeTests<java.awt.JobAttributes.MultipleDocumentHandlingType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.JobAttributes.MultipleDocumentHandlingType.SEPARATE_DOCUMENTS_COLLATED_COPIES, //
                                    java.awt.JobAttributes.MultipleDocumentHandlingType.SEPARATE_DOCUMENTS_UNCOLLATED_COPIES);
        }

        @Parameter(0)
        public java.awt.JobAttributes.MultipleDocumentHandlingType sut;

        @Override
        public java.awt.JobAttributes.MultipleDocumentHandlingType createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DefaultSelectionTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.DefaultSelectionTypeTests<java.awt.JobAttributes.DefaultSelectionType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.JobAttributes.DefaultSelectionType.ALL, //
                                    java.awt.JobAttributes.DefaultSelectionType.RANGE, //
                                    java.awt.JobAttributes.DefaultSelectionType.SELECTION);
        }

        @Parameter(0)
        public java.awt.JobAttributes.DefaultSelectionType sut;

        @Override
        public java.awt.JobAttributes.DefaultSelectionType createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DestinationTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.DestinationTypeTests<java.awt.JobAttributes.DestinationType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.JobAttributes.DestinationType.PRINTER, //
                                    java.awt.JobAttributes.DestinationType.FILE);
        }

        @Parameter(0)
        public java.awt.JobAttributes.DestinationType sut;

        @Override
        public java.awt.JobAttributes.DestinationType createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DialogTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.DialogTypeTests<java.awt.JobAttributes.DialogType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.JobAttributes.DialogType.NATIVE, //
                                    java.awt.JobAttributes.DialogType.COMMON, //
                                    java.awt.JobAttributes.DialogType.NONE);
        }

        @Parameter(0)
        public java.awt.JobAttributes.DialogType sut;

        @Override
        public java.awt.JobAttributes.DialogType createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class SidesTypeTest
    implements org.j8unit.repository.java.awt.JobAttributesTests.SidesTypeTests<java.awt.JobAttributes.SidesType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.JobAttributes.SidesType.TWO_SIDED_LONG_EDGE, //
                                    java.awt.JobAttributes.SidesType.ONE_SIDED, //
                                    java.awt.JobAttributes.SidesType.TWO_SIDED_SHORT_EDGE);
        }

        @Parameter(0)
        public java.awt.JobAttributes.SidesType sut;

        @Override
        public java.awt.JobAttributes.SidesType createNewSUT() {
            return this.sut;
        }

    }

}
