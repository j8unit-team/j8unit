package org.j8unit.repository.javax.swing;

import javax.swing.AbstractSpinnerModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractSpinnerModel} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.AbstractSpinnerModelTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractSpinnerModelTest
implements AbstractSpinnerModelTests<AbstractSpinnerModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.AbstractSpinnerModel]

    @Override
    public AbstractSpinnerModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.AbstractSpinnerModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.AbstractSpinnerModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.AbstractSpinnerModel]

}
