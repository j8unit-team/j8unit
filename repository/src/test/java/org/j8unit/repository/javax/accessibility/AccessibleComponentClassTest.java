package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleComponent;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleComponent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleComponentClassTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleComponentClassTest
implements AccessibleComponentClassTests<AccessibleComponent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleComponent]

    @Override
    public Class<AccessibleComponent> createNewSUT() {
        return AccessibleComponent.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleComponent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleComponent]

}
