package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.PrintQuality;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintQuality} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.standard.PrintQualityClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrintQualityClassTest
implements PrintQualityClassTests<PrintQuality> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.PrintQuality]

    @Override
    public Class<PrintQuality> createNewSUT() {
        return PrintQuality.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.PrintQuality]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.PrintQuality]

}
