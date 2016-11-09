package org.j8unit.repository.javax.swing.text;

import javax.swing.text.ViewFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ViewFactory} (by simply reusing the
 * J8Unit test interface {@link ViewFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class ViewFactoryClassTest
implements ViewFactoryClassTests<ViewFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.ViewFactory]

    @Override
    public Class<ViewFactory> createNewSUT() {
        return ViewFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.ViewFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.ViewFactory]

}
