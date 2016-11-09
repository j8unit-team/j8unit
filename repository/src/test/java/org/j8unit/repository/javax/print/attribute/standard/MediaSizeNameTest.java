package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.MediaSizeName;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MediaSizeName} (by simply reusing the
 * J8Unit test interface {@link MediaSizeNameTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MediaSizeNameTest
implements MediaSizeNameTests<MediaSizeName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaSizeName]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MediaSizeName.B, //
                                MediaSizeName.C, //
                                MediaSizeName.A, //
                                MediaSizeName.D, //
                                MediaSizeName.E, //
                                MediaSizeName.JIS_B10, //
                                MediaSizeName.ISO_B10, //
                                MediaSizeName.JAPANESE_DOUBLE_POSTCARD, //
                                MediaSizeName.NA_10X14_ENVELOPE, //
                                MediaSizeName.EXECUTIVE, //
                                MediaSizeName.NA_NUMBER_10_ENVELOPE, //
                                MediaSizeName.ISO_A1, //
                                MediaSizeName.ISO_A2, //
                                MediaSizeName.ISO_A0, //
                                MediaSizeName.ISO_A5, //
                                MediaSizeName.ISO_A6, //
                                MediaSizeName.ISO_A3, //
                                MediaSizeName.ISO_A4, //
                                MediaSizeName.NA_10X15_ENVELOPE, //
                                MediaSizeName.MONARCH_ENVELOPE, //
                                MediaSizeName.TABLOID, //
                                MediaSizeName.NA_LEGAL, //
                                MediaSizeName.FOLIO, //
                                MediaSizeName.LEDGER, //
                                MediaSizeName.ISO_A9, //
                                MediaSizeName.ISO_A7, //
                                MediaSizeName.ISO_A8, //
                                MediaSizeName.ISO_B2, //
                                MediaSizeName.NA_10X13_ENVELOPE, //
                                MediaSizeName.ISO_B3, //
                                MediaSizeName.NA_NUMBER_14_ENVELOPE, //
                                MediaSizeName.ISO_B0, //
                                MediaSizeName.NA_NUMBER_11_ENVELOPE, //
                                MediaSizeName.ISO_B1, //
                                MediaSizeName.ISO_B6, //
                                MediaSizeName.ISO_B7, //
                                MediaSizeName.ISO_B4, //
                                MediaSizeName.ISO_B5, //
                                MediaSizeName.JAPANESE_POSTCARD, //
                                MediaSizeName.ISO_A10, //
                                MediaSizeName.JIS_B7, //
                                MediaSizeName.JIS_B8, //
                                MediaSizeName.JIS_B9, //
                                MediaSizeName.NA_9X11_ENVELOPE, //
                                MediaSizeName.NA_5X7, //
                                MediaSizeName.QUARTO, //
                                MediaSizeName.ISO_B8, //
                                MediaSizeName.ISO_B9, //
                                MediaSizeName.ISO_DESIGNATED_LONG, //
                                MediaSizeName.PERSONAL_ENVELOPE, //
                                MediaSizeName.ISO_C3, //
                                MediaSizeName.ISO_C4, //
                                MediaSizeName.NA_6X9_ENVELOPE, //
                                MediaSizeName.ISO_C1, //
                                MediaSizeName.ISO_C2, //
                                MediaSizeName.ISO_C5, //
                                MediaSizeName.ISO_C6, //
                                MediaSizeName.NA_NUMBER_12_ENVELOPE, //
                                MediaSizeName.JIS_B0, //
                                MediaSizeName.JIS_B1, //
                                MediaSizeName.NA_LETTER, //
                                MediaSizeName.JIS_B2, //
                                MediaSizeName.JIS_B3, //
                                MediaSizeName.JIS_B4, //
                                MediaSizeName.ISO_C0, //
                                MediaSizeName.NA_NUMBER_9_ENVELOPE, //
                                MediaSizeName.JIS_B5, //
                                MediaSizeName.INVOICE, //
                                MediaSizeName.JIS_B6, //
                                MediaSizeName.NA_8X10, //
                                MediaSizeName.NA_7X9_ENVELOPE, //
                                MediaSizeName.ITALY_ENVELOPE, //
                                MediaSizeName.NA_9X12_ENVELOPE);
    }

    @Parameter(0)
    public MediaSizeName sut;

    @Override
    public MediaSizeName createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.MediaSizeName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MediaSizeName]

}
