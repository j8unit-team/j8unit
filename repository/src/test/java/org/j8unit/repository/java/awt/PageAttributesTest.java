package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.PageAttributes;
import java.awt.PageAttributes.ColorType;
import java.awt.PageAttributes.MediaType;
import java.awt.PageAttributes.OrientationRequestedType;
import java.awt.PageAttributes.OriginType;
import java.awt.PageAttributes.PrintQualityType;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PageAttributesTest
implements FactoryBasedJ8UnitTest<PageAttributes>, org.j8unit.repository.java.awt.PageAttributesTests<PageAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PageAttributes::new);
    }

    @Parameter(0)
    public Callable<PageAttributes> sutFactory;

    @Override
    public Callable<PageAttributes> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes]

    @RunWith(J8Unit4.class)
    public static class OriginTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.OriginTypeTests<OriginType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$OriginType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(OriginType.PHYSICAL, //
                                                       OriginType.PRINTABLE);
        }

        @Parameter(0)
        public OriginType sut;

        @Override
        public OriginType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$OriginType]

    }

    @RunWith(J8Unit4.class)
    public static class PrintQualityTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.PrintQualityTypeTests<PrintQualityType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$PrintQualityType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(PrintQualityType.HIGH, //
                                                       PrintQualityType.DRAFT, //
                                                       PrintQualityType.NORMAL);
        }

        @Parameter(0)
        public PrintQualityType sut;

        @Override
        public PrintQualityType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$PrintQualityType]

    }

    @RunWith(J8Unit4.class)
    public static class ColorTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.ColorTypeTests<ColorType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$ColorType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(ColorType.COLOR, //
                                                       ColorType.MONOCHROME);
        }

        @Parameter(0)
        public ColorType sut;

        @Override
        public ColorType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$ColorType]

    }

    @RunWith(J8Unit4.class)
    public static class MediaTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.MediaTypeTests<MediaType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$MediaType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(MediaType.ISO_C1_ENVELOPE, //
                                                       MediaType.ISO_B5_ENVELOPE, //
                                                       MediaType.ISO_A3, //
                                                       MediaType.ISO_A4, //
                                                       MediaType.ISO_A5, //
                                                       MediaType.ISO_A6, //
                                                       MediaType.ISO_A0, //
                                                       MediaType.ISO_A1, //
                                                       MediaType.ISO_A2, //
                                                       MediaType.ISO_A7, //
                                                       MediaType.ISO_C6_ENVELOPE, //
                                                       MediaType.ISO_A8, //
                                                       MediaType.ISO_A9, //
                                                       MediaType.NA_LEGAL, //
                                                       MediaType.C0, //
                                                       MediaType.C1, //
                                                       MediaType.C2, //
                                                       MediaType.ISO_C9_ENVELOPE, //
                                                       MediaType.D, //
                                                       MediaType.E, //
                                                       MediaType.ENV_10X15, //
                                                       MediaType.A, //
                                                       MediaType.ENV_10X14, //
                                                       MediaType.B, //
                                                       MediaType.ENV_10X13, //
                                                       MediaType.C, //
                                                       MediaType.NA_NUMBER_10_ENVELOPE, //
                                                       MediaType.NA_10X14_ENVELOPE, //
                                                       MediaType.C7, //
                                                       MediaType.C8, //
                                                       MediaType.C9, //
                                                       MediaType.C3, //
                                                       MediaType.ISO_DESIGNATED_LONG_ENVELOPE, //
                                                       MediaType.PERSONAL, //
                                                       MediaType.C4, //
                                                       MediaType.C5, //
                                                       MediaType.C6, //
                                                       MediaType.JIS_B5, //
                                                       MediaType.JIS_B6, //
                                                       MediaType.JIS_B3, //
                                                       MediaType.B0, //
                                                       MediaType.JIS_B4, //
                                                       MediaType.ISO_C0, //
                                                       MediaType.NA_NUMBER_9_ENVELOPE, //
                                                       MediaType.B1, //
                                                       MediaType.JIS_B1, //
                                                       MediaType.NA_LETTER, //
                                                       MediaType.ISO_2A0, //
                                                       MediaType.JIS_B2, //
                                                       MediaType.ENV_6X9, //
                                                       MediaType.JIS_B0, //
                                                       MediaType.ISO_C5, //
                                                       MediaType.ISO_C6, //
                                                       MediaType.ISO_C7, //
                                                       MediaType.ISO_C8, //
                                                       MediaType.ISO_C1, //
                                                       MediaType.A10, //
                                                       MediaType.ISO_C2, //
                                                       MediaType.ISO_C3, //
                                                       MediaType.ISO_C4, //
                                                       MediaType.ENV_9X11, //
                                                       MediaType.ENV_ITALY, //
                                                       MediaType.ENV_9X12, //
                                                       MediaType.ISO_C9, //
                                                       MediaType.NA_7X9_ENVELOPE, //
                                                       MediaType.MONARCH, //
                                                       MediaType.ISO_C3_ENVELOPE, //
                                                       MediaType.B6, //
                                                       MediaType.B7, //
                                                       MediaType.B8, //
                                                       MediaType.B9, //
                                                       MediaType.B2, //
                                                       MediaType.B3, //
                                                       MediaType.B4, //
                                                       MediaType.B5, //
                                                       MediaType.INVITE, //
                                                       MediaType.ISO_C8_ENVELOPE, //
                                                       MediaType.A0, //
                                                       MediaType.ISO_B4, //
                                                       MediaType.ENV_INVITE, //
                                                       MediaType.ISO_B5, //
                                                       MediaType.ISO_B6, //
                                                       MediaType.ISO_C10, //
                                                       MediaType.ISO_B7, //
                                                       MediaType.ISO_B0, //
                                                       MediaType.ISO_B1, //
                                                       MediaType.ISO_B2, //
                                                       MediaType.NA_10X13_ENVELOPE, //
                                                       MediaType.ISO_B3, //
                                                       MediaType.NA_NUMBER_14_ENVELOPE, //
                                                       MediaType.PERSONAL_ENVELOPE, //
                                                       MediaType.ISO_B8, //
                                                       MediaType.A9, //
                                                       MediaType.ISO_B9, //
                                                       MediaType.A5, //
                                                       MediaType.A6, //
                                                       MediaType.A7, //
                                                       MediaType.A8, //
                                                       MediaType.JIS_B9, //
                                                       MediaType.A1, //
                                                       MediaType.A2, //
                                                       MediaType.JIS_B7, //
                                                       MediaType.A3, //
                                                       MediaType.JIS_B8, //
                                                       MediaType.A4, //
                                                       MediaType.ISO_C2_ENVELOPE, //
                                                       MediaType.TABLOID, //
                                                       MediaType.MONARCH_ENVELOPE, //
                                                       MediaType.ENV_7X9, //
                                                       MediaType.NA_10X15_ENVELOPE, //
                                                       MediaType.ISO_C7_ENVELOPE, //
                                                       MediaType.ENV_14, //
                                                       MediaType.ENV_11, //
                                                       MediaType.B10, //
                                                       MediaType.ENV_12, //
                                                       MediaType.ENV_10, //
                                                       MediaType.LEDGER, //
                                                       MediaType.FOLIO, //
                                                       MediaType.ISO_B10, //
                                                       MediaType.JIS_B10, //
                                                       MediaType.ISO_C0_ENVELOPE, //
                                                       MediaType.ISO_B4_ENVELOPE, //
                                                       MediaType.ENV_PERSONAL, //
                                                       MediaType.EXECUTIVE, //
                                                       MediaType.ENV_MONARCH, //
                                                       MediaType.NOTE, //
                                                       MediaType.LEGAL, //
                                                       MediaType.INVITE_ENVELOPE, //
                                                       MediaType.INVOICE, //
                                                       MediaType.ITALY, //
                                                       MediaType.NA_NUMBER_12_ENVELOPE, //
                                                       MediaType.ISO_C10_ENVELOPE, //
                                                       MediaType.ISO_4A0, //
                                                       MediaType.NA_6X9_ENVELOPE, //
                                                       MediaType.ISO_C4_ENVELOPE, //
                                                       MediaType.C10, //
                                                       MediaType.NA_9X12_ENVELOPE, //
                                                       MediaType.ITALY_ENVELOPE, //
                                                       MediaType.ENV_9, //
                                                       MediaType.ISO_A10, //
                                                       MediaType.NA_NUMBER_11_ENVELOPE, //
                                                       MediaType.STATEMENT, //
                                                       MediaType.LETTER, //
                                                       MediaType.ISO_DESIGNATED_LONG, //
                                                       MediaType.QUARTO, //
                                                       MediaType.NA_9X11_ENVELOPE, //
                                                       MediaType.ISO_C5_ENVELOPE);
        }

        @Parameter(0)
        public MediaType sut;

        @Override
        public MediaType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$MediaType]

    }

    @RunWith(J8Unit4.class)
    public static class OrientationRequestedTypeTest
    implements org.j8unit.repository.java.awt.PageAttributesTests.OrientationRequestedTypeTests<OrientationRequestedType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$OrientationRequestedType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(OrientationRequestedType.PORTRAIT, //
                                                       OrientationRequestedType.LANDSCAPE);
        }

        @Parameter(0)
        public OrientationRequestedType sut;

        @Override
        public OrientationRequestedType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PageAttributes$OrientationRequestedType]

    }

}
