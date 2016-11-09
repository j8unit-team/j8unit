package org.j8unit.repository.javax.swing;

import javax.swing.ScrollPaneConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ScrollPaneConstants} (by simply reusing
 * the J8Unit test interface {@link ScrollPaneConstantsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ScrollPaneConstantsClassTest
implements ScrollPaneConstantsClassTests<ScrollPaneConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ScrollPaneConstants]

    @Override
    public Class<ScrollPaneConstants> createNewSUT() {
        return ScrollPaneConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ScrollPaneConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ScrollPaneConstants]

}
