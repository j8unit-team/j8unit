package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.MediaName;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class MediaNameTest
implements org.j8unit.repository.javax.print.attribute.standard.MediaNameTests<MediaName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaName]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MediaName.NA_LETTER_TRANSPARENT, //
                                MediaName.NA_LETTER_WHITE, //
                                MediaName.ISO_A4_WHITE, //
                                MediaName.ISO_A4_TRANSPARENT);
    }

    @Parameter(0)
    public MediaName sut;

    @Override
    public MediaName createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaName]

}
