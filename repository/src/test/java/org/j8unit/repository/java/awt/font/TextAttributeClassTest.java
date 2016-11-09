package org.j8unit.repository.java.awt.font;

import java.awt.font.TextAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextAttribute} (by simply reusing the
 * J8Unit test interface {@link TextAttributeClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextAttributeClassTest
implements TextAttributeClassTests<TextAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.font.TextAttribute]

    @Override
    public Class<TextAttribute> createNewSUT() {
        return TextAttribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.font.TextAttribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.font.TextAttribute]

}
