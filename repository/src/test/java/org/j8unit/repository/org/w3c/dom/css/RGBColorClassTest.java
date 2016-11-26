package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.RGBColor;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RGBColor} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.css.RGBColorClassTests}).
 */
@RunWith(J8Unit4.class)
public class RGBColorClassTest
implements RGBColorClassTests<RGBColor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.RGBColor]

    @Override
    public Class<RGBColor> createNewSUT() {
        return RGBColor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.RGBColor]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.RGBColor]

}
