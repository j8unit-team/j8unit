package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleTableModelChange;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleTableModelChange} (by
 * simply reusing the J8Unit test interface {@link AccessibleTableModelChangeTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleTableModelChangeTest
implements AccessibleTableModelChangeTests<AccessibleTableModelChange> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleTableModelChange]

    @Override
    public AccessibleTableModelChange createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleTableModelChange], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleTableModelChange]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleTableModelChange]

}
