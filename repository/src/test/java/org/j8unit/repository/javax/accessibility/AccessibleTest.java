package org.j8unit.repository.javax.accessibility;

import javax.accessibility.Accessible;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Accessible} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleTest
implements AccessibleTests<Accessible> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.Accessible]

    @Override
    public Accessible createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.Accessible], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.Accessible]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.Accessible]

}
