package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleContextTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleContextTest
implements AccessibleContextTests<AccessibleContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleContext]

    @Override
    public AccessibleContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleContext]

}
