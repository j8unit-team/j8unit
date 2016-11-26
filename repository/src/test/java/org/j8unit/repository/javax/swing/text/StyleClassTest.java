package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Style;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Style} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.swing.text.StyleClassTests}).
 */
@RunWith(J8Unit4.class)
public class StyleClassTest
implements StyleClassTests<Style> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Style]

    @Override
    public Class<Style> createNewSUT() {
        return Style.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Style]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Style]

}
