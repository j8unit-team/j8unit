package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleAttributeSequence;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleAttributeSequence} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.accessibility.AccessibleAttributeSequenceTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleAttributeSequenceTest
implements AccessibleAttributeSequenceTests<AccessibleAttributeSequence> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleAttributeSequence]

    @Override
    public AccessibleAttributeSequence createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.accessibility.AccessibleAttributeSequence], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleAttributeSequence]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleAttributeSequence]

}
