package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleExtendedComponent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleExtendedComponent} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.accessibility.AccessibleExtendedComponentClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleExtendedComponentClassTest
implements AccessibleExtendedComponentClassTests<AccessibleExtendedComponent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleExtendedComponent]

    @Override
    public Class<AccessibleExtendedComponent> createNewSUT() {
        return AccessibleExtendedComponent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleExtendedComponent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleExtendedComponent]

}
