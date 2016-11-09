package org.j8unit.repository.javax.swing;

import javax.swing.SpinnerModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SpinnerModel} (by simply reusing the
 * J8Unit test interface {@link SpinnerModelTests}).
 */

@RunWith(J8Unit4.class)
public class SpinnerModelTest
implements SpinnerModelTests<SpinnerModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SpinnerModel]

    @Override
    public SpinnerModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.SpinnerModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.SpinnerModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.SpinnerModel]

}
