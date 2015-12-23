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
public class PageAttributesTest
implements org.j8unit.repository.java.awt.PageAttributesTests<java.awt.PageAttributes> {

    @Override
    public java.awt.PageAttributes createNewSUT() {
        return new java.awt.PageAttributes();
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class OrientationRequestedTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.OrientationRequestedTypeTests<java.awt.PageAttributes.OrientationRequestedType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.PageAttributes.OrientationRequestedType.PORTRAIT, //
                                    java.awt.PageAttributes.OrientationRequestedType.LANDSCAPE);
        }

        @Parameter(0)
        public java.awt.PageAttributes.OrientationRequestedType sut;

        @Override
        public java.awt.PageAttributes.OrientationRequestedType createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PrintQualityTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.PrintQualityTypeTests<java.awt.PageAttributes.PrintQualityType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.PageAttributes.PrintQualityType.HIGH, //
                                    java.awt.PageAttributes.PrintQualityType.DRAFT, //
                                    java.awt.PageAttributes.PrintQualityType.NORMAL);
        }

        @Parameter(0)
        public java.awt.PageAttributes.PrintQualityType sut;

        @Override
        public java.awt.PageAttributes.PrintQualityType createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ColorTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.ColorTypeTests<java.awt.PageAttributes.ColorType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.PageAttributes.ColorType.COLOR, //
                                    java.awt.PageAttributes.ColorType.MONOCHROME);
        }

        @Parameter(0)
        public java.awt.PageAttributes.ColorType sut;

        @Override
        public java.awt.PageAttributes.ColorType createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class MediaTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.MediaTypeTests<java.awt.PageAttributes.MediaType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.PageAttributes.MediaType.ISO_C1_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_B5_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_A3, //
                                    java.awt.PageAttributes.MediaType.ISO_A4, //
                                    java.awt.PageAttributes.MediaType.ISO_A5, //
                                    java.awt.PageAttributes.MediaType.ISO_A6, //
                                    java.awt.PageAttributes.MediaType.ISO_A0, //
                                    java.awt.PageAttributes.MediaType.ISO_A1, //
                                    java.awt.PageAttributes.MediaType.ISO_A2, //
                                    java.awt.PageAttributes.MediaType.ISO_A7, //
                                    java.awt.PageAttributes.MediaType.ISO_C6_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_A8, //
                                    java.awt.PageAttributes.MediaType.ISO_A9, //
                                    java.awt.PageAttributes.MediaType.NA_LEGAL, //
                                    java.awt.PageAttributes.MediaType.C0, //
                                    java.awt.PageAttributes.MediaType.C1, //
                                    java.awt.PageAttributes.MediaType.C2, //
                                    java.awt.PageAttributes.MediaType.ISO_C9_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.D, //
                                    java.awt.PageAttributes.MediaType.E, //
                                    java.awt.PageAttributes.MediaType.ENV_10X15, //
                                    java.awt.PageAttributes.MediaType.A, //
                                    java.awt.PageAttributes.MediaType.ENV_10X14, //
                                    java.awt.PageAttributes.MediaType.B, //
                                    java.awt.PageAttributes.MediaType.ENV_10X13, //
                                    java.awt.PageAttributes.MediaType.C, //
                                    java.awt.PageAttributes.MediaType.NA_NUMBER_10_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.NA_10X14_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.C7, //
                                    java.awt.PageAttributes.MediaType.C8, //
                                    java.awt.PageAttributes.MediaType.C9, //
                                    java.awt.PageAttributes.MediaType.C3, //
                                    java.awt.PageAttributes.MediaType.ISO_DESIGNATED_LONG_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.PERSONAL, //
                                    java.awt.PageAttributes.MediaType.C4, //
                                    java.awt.PageAttributes.MediaType.C5, //
                                    java.awt.PageAttributes.MediaType.C6, //
                                    java.awt.PageAttributes.MediaType.JIS_B5, //
                                    java.awt.PageAttributes.MediaType.JIS_B6, //
                                    java.awt.PageAttributes.MediaType.JIS_B3, //
                                    java.awt.PageAttributes.MediaType.B0, //
                                    java.awt.PageAttributes.MediaType.JIS_B4, //
                                    java.awt.PageAttributes.MediaType.ISO_C0, //
                                    java.awt.PageAttributes.MediaType.NA_NUMBER_9_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.B1, //
                                    java.awt.PageAttributes.MediaType.JIS_B1, //
                                    java.awt.PageAttributes.MediaType.NA_LETTER, //
                                    java.awt.PageAttributes.MediaType.ISO_2A0, //
                                    java.awt.PageAttributes.MediaType.JIS_B2, //
                                    java.awt.PageAttributes.MediaType.ENV_6X9, //
                                    java.awt.PageAttributes.MediaType.JIS_B0, //
                                    java.awt.PageAttributes.MediaType.ISO_C5, //
                                    java.awt.PageAttributes.MediaType.ISO_C6, //
                                    java.awt.PageAttributes.MediaType.ISO_C7, //
                                    java.awt.PageAttributes.MediaType.ISO_C8, //
                                    java.awt.PageAttributes.MediaType.ISO_C1, //
                                    java.awt.PageAttributes.MediaType.A10, //
                                    java.awt.PageAttributes.MediaType.ISO_C2, //
                                    java.awt.PageAttributes.MediaType.ISO_C3, //
                                    java.awt.PageAttributes.MediaType.ISO_C4, //
                                    java.awt.PageAttributes.MediaType.ENV_9X11, //
                                    java.awt.PageAttributes.MediaType.ENV_ITALY, //
                                    java.awt.PageAttributes.MediaType.ENV_9X12, //
                                    java.awt.PageAttributes.MediaType.ISO_C9, //
                                    java.awt.PageAttributes.MediaType.NA_7X9_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.MONARCH, //
                                    java.awt.PageAttributes.MediaType.ISO_C3_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.B6, //
                                    java.awt.PageAttributes.MediaType.B7, //
                                    java.awt.PageAttributes.MediaType.B8, //
                                    java.awt.PageAttributes.MediaType.B9, //
                                    java.awt.PageAttributes.MediaType.B2, //
                                    java.awt.PageAttributes.MediaType.B3, //
                                    java.awt.PageAttributes.MediaType.B4, //
                                    java.awt.PageAttributes.MediaType.B5, //
                                    java.awt.PageAttributes.MediaType.INVITE, //
                                    java.awt.PageAttributes.MediaType.ISO_C8_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.A0, //
                                    java.awt.PageAttributes.MediaType.ISO_B4, //
                                    java.awt.PageAttributes.MediaType.ENV_INVITE, //
                                    java.awt.PageAttributes.MediaType.ISO_B5, //
                                    java.awt.PageAttributes.MediaType.ISO_B6, //
                                    java.awt.PageAttributes.MediaType.ISO_C10, //
                                    java.awt.PageAttributes.MediaType.ISO_B7, //
                                    java.awt.PageAttributes.MediaType.ISO_B0, //
                                    java.awt.PageAttributes.MediaType.ISO_B1, //
                                    java.awt.PageAttributes.MediaType.ISO_B2, //
                                    java.awt.PageAttributes.MediaType.NA_10X13_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_B3, //
                                    java.awt.PageAttributes.MediaType.NA_NUMBER_14_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.PERSONAL_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_B8, //
                                    java.awt.PageAttributes.MediaType.A9, //
                                    java.awt.PageAttributes.MediaType.ISO_B9, //
                                    java.awt.PageAttributes.MediaType.A5, //
                                    java.awt.PageAttributes.MediaType.A6, //
                                    java.awt.PageAttributes.MediaType.A7, //
                                    java.awt.PageAttributes.MediaType.A8, //
                                    java.awt.PageAttributes.MediaType.JIS_B9, //
                                    java.awt.PageAttributes.MediaType.A1, //
                                    java.awt.PageAttributes.MediaType.A2, //
                                    java.awt.PageAttributes.MediaType.JIS_B7, //
                                    java.awt.PageAttributes.MediaType.A3, //
                                    java.awt.PageAttributes.MediaType.JIS_B8, //
                                    java.awt.PageAttributes.MediaType.A4, //
                                    java.awt.PageAttributes.MediaType.ISO_C2_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.TABLOID, //
                                    java.awt.PageAttributes.MediaType.MONARCH_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ENV_7X9, //
                                    java.awt.PageAttributes.MediaType.NA_10X15_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_C7_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ENV_14, //
                                    java.awt.PageAttributes.MediaType.ENV_11, //
                                    java.awt.PageAttributes.MediaType.B10, //
                                    java.awt.PageAttributes.MediaType.ENV_12, //
                                    java.awt.PageAttributes.MediaType.ENV_10, //
                                    java.awt.PageAttributes.MediaType.LEDGER, //
                                    java.awt.PageAttributes.MediaType.FOLIO, //
                                    java.awt.PageAttributes.MediaType.ISO_B10, //
                                    java.awt.PageAttributes.MediaType.JIS_B10, //
                                    java.awt.PageAttributes.MediaType.ISO_C0_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_B4_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ENV_PERSONAL, //
                                    java.awt.PageAttributes.MediaType.EXECUTIVE, //
                                    java.awt.PageAttributes.MediaType.ENV_MONARCH, //
                                    java.awt.PageAttributes.MediaType.NOTE, //
                                    java.awt.PageAttributes.MediaType.LEGAL, //
                                    java.awt.PageAttributes.MediaType.INVITE_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.INVOICE, //
                                    java.awt.PageAttributes.MediaType.ITALY, //
                                    java.awt.PageAttributes.MediaType.NA_NUMBER_12_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_C10_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_4A0, //
                                    java.awt.PageAttributes.MediaType.NA_6X9_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_C4_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.C10, //
                                    java.awt.PageAttributes.MediaType.NA_9X12_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ITALY_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ENV_9, //
                                    java.awt.PageAttributes.MediaType.ISO_A10, //
                                    java.awt.PageAttributes.MediaType.NA_NUMBER_11_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.STATEMENT, //
                                    java.awt.PageAttributes.MediaType.LETTER, //
                                    java.awt.PageAttributes.MediaType.ISO_DESIGNATED_LONG, //
                                    java.awt.PageAttributes.MediaType.QUARTO, //
                                    java.awt.PageAttributes.MediaType.NA_9X11_ENVELOPE, //
                                    java.awt.PageAttributes.MediaType.ISO_C5_ENVELOPE);
        }

        @Parameter(0)
        public java.awt.PageAttributes.MediaType sut;

        @Override
        public java.awt.PageAttributes.MediaType createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class OriginTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.OriginTypeTests<java.awt.PageAttributes.OriginType> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.awt.PageAttributes.OriginType.PHYSICAL, //
                                    java.awt.PageAttributes.OriginType.PRINTABLE);
        }

        @Parameter(0)
        public java.awt.PageAttributes.OriginType sut;

        @Override
        public java.awt.PageAttributes.OriginType createNewSUT() {
            return this.sut;
        }

    }

}
