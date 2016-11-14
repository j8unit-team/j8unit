package org.j8unit.repository.java.awt;

import java.awt.FocusTraversalPolicy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FocusTraversalPolicy} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.FocusTraversalPolicyTests}).
 */

@RunWith(J8Unit4.class)
public class FocusTraversalPolicyTest
implements FocusTraversalPolicyTests<FocusTraversalPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.FocusTraversalPolicy]

    @Override
    public FocusTraversalPolicy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.FocusTraversalPolicy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.FocusTraversalPolicy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.FocusTraversalPolicy]

}
