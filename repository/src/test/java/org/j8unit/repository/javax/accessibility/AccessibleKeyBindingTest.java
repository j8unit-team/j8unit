package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleKeyBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleKeyBinding} (by simply
 * reusing the J8Unit test interface {@link AccessibleKeyBindingTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleKeyBindingTest
implements AccessibleKeyBindingTests<AccessibleKeyBinding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleKeyBinding]

    @Override
    public AccessibleKeyBinding createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleKeyBinding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleKeyBinding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleKeyBinding]

}
