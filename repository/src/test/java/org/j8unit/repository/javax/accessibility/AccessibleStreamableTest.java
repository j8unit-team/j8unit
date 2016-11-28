package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleStreamable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleStreamable} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleStreamableTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleStreamableTest
implements AccessibleStreamableTests<AccessibleStreamable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleStreamable]

    @Override
    public AccessibleStreamable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleStreamable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleStreamable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleStreamable]

}
