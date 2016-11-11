package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.ColorSupported;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ColorSupported} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.standard.ColorSupportedClassTests}).
 */

@RunWith(J8Unit4.class)
public class ColorSupportedClassTest
implements ColorSupportedClassTests<ColorSupported> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.ColorSupported]

    @Override
    public Class<ColorSupported> createNewSUT() {
        return ColorSupported.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.ColorSupported]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.ColorSupported]

}
