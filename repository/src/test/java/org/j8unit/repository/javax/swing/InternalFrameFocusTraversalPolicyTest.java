package org.j8unit.repository.javax.swing;

import javax.swing.InternalFrameFocusTraversalPolicy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InternalFrameFocusTraversalPolicy}
 * (by simply reusing the J8Unit test interface {@link InternalFrameFocusTraversalPolicyTests}).
 */

@RunWith(J8Unit4.class)
public class InternalFrameFocusTraversalPolicyTest
implements InternalFrameFocusTraversalPolicyTests<InternalFrameFocusTraversalPolicy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.InternalFrameFocusTraversalPolicy]

    @Override
    public InternalFrameFocusTraversalPolicy createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.InternalFrameFocusTraversalPolicy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.InternalFrameFocusTraversalPolicy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.InternalFrameFocusTraversalPolicy]

}
