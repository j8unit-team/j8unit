package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MediaSizeNameTest
implements org.j8unit.repository.javax.print.attribute.standard.MediaSizeNameTests<javax.print.attribute.standard.MediaSizeName> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.MediaSizeName.B, //
                                javax.print.attribute.standard.MediaSizeName.C, //
                                javax.print.attribute.standard.MediaSizeName.A, //
                                javax.print.attribute.standard.MediaSizeName.D, //
                                javax.print.attribute.standard.MediaSizeName.E, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B10, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B10, //
                                javax.print.attribute.standard.MediaSizeName.JAPANESE_DOUBLE_POSTCARD, //
                                javax.print.attribute.standard.MediaSizeName.NA_10X14_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.EXECUTIVE, //
                                javax.print.attribute.standard.MediaSizeName.NA_NUMBER_10_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A1, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A2, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A0, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A5, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A6, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A3, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A4, //
                                javax.print.attribute.standard.MediaSizeName.NA_10X15_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.MONARCH_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.TABLOID, //
                                javax.print.attribute.standard.MediaSizeName.NA_LEGAL, //
                                javax.print.attribute.standard.MediaSizeName.FOLIO, //
                                javax.print.attribute.standard.MediaSizeName.LEDGER, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A9, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A7, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A8, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B2, //
                                javax.print.attribute.standard.MediaSizeName.NA_10X13_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B3, //
                                javax.print.attribute.standard.MediaSizeName.NA_NUMBER_14_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B0, //
                                javax.print.attribute.standard.MediaSizeName.NA_NUMBER_11_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B1, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B6, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B7, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B4, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B5, //
                                javax.print.attribute.standard.MediaSizeName.JAPANESE_POSTCARD, //
                                javax.print.attribute.standard.MediaSizeName.ISO_A10, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B7, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B8, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B9, //
                                javax.print.attribute.standard.MediaSizeName.NA_9X11_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.NA_5X7, //
                                javax.print.attribute.standard.MediaSizeName.QUARTO, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B8, //
                                javax.print.attribute.standard.MediaSizeName.ISO_B9, //
                                javax.print.attribute.standard.MediaSizeName.ISO_DESIGNATED_LONG, //
                                javax.print.attribute.standard.MediaSizeName.PERSONAL_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.ISO_C3, //
                                javax.print.attribute.standard.MediaSizeName.ISO_C4, //
                                javax.print.attribute.standard.MediaSizeName.NA_6X9_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.ISO_C1, //
                                javax.print.attribute.standard.MediaSizeName.ISO_C2, //
                                javax.print.attribute.standard.MediaSizeName.ISO_C5, //
                                javax.print.attribute.standard.MediaSizeName.ISO_C6, //
                                javax.print.attribute.standard.MediaSizeName.NA_NUMBER_12_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B0, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B1, //
                                javax.print.attribute.standard.MediaSizeName.NA_LETTER, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B2, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B3, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B4, //
                                javax.print.attribute.standard.MediaSizeName.ISO_C0, //
                                javax.print.attribute.standard.MediaSizeName.NA_NUMBER_9_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B5, //
                                javax.print.attribute.standard.MediaSizeName.INVOICE, //
                                javax.print.attribute.standard.MediaSizeName.JIS_B6, //
                                javax.print.attribute.standard.MediaSizeName.NA_8X10, //
                                javax.print.attribute.standard.MediaSizeName.NA_7X9_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.ITALY_ENVELOPE, //
                                javax.print.attribute.standard.MediaSizeName.NA_9X12_ENVELOPE);
    }

    @Parameter(0)
    public javax.print.attribute.standard.MediaSizeName sut;

    @Override
    public javax.print.attribute.standard.MediaSizeName createNewSUT() {
        return this.sut;
    }

}
