package org.j8unit.repository.javax.swing;

import javax.swing.Icon;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Icon} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.swing.IconClassTests}).
 */
@RunWith(J8Unit4.class)
public class IconClassTest
implements IconClassTests<Icon> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Icon]

    @Override
    public Class<Icon> createNewSUT() {
        return Icon.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.Icon]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Icon]

}
