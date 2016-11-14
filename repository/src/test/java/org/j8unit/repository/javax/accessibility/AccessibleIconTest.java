package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleIcon;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleIcon} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleIconTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleIconTest
implements AccessibleIconTests<AccessibleIcon> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleIcon]

    @Override
    public AccessibleIcon createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleIcon], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleIcon]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleIcon]

}
