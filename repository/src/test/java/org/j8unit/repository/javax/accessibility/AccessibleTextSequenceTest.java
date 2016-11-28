package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleTextSequence;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleTextSequence} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleTextSequenceTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleTextSequenceTest
implements AccessibleTextSequenceTests<AccessibleTextSequence> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleTextSequence]

    @Override
    public AccessibleTextSequence createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.accessibility.AccessibleTextSequence], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleTextSequence]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleTextSequence]

}
