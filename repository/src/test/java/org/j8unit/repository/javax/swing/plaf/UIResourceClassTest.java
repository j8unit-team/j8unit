package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.UIResource;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UIResource} (by simply reusing the J8Unit
 * test interface {@link UIResourceClassTests}).
 */

@RunWith(J8Unit4.class)
public class UIResourceClassTest
implements UIResourceClassTests<UIResource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.UIResource]

    @Override
    public Class<UIResource> createNewSUT() {
        return UIResource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.UIResource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.UIResource]

}
