package org.j8unit.repository.javax.swing;

import javax.swing.SingleSelectionModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SingleSelectionModel} (by simply
 * reusing the J8Unit test interface {@link SingleSelectionModelTests}).
 */

@RunWith(J8Unit4.class)
public class SingleSelectionModelTest
implements SingleSelectionModelTests<SingleSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SingleSelectionModel]

    @Override
    public SingleSelectionModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.SingleSelectionModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.SingleSelectionModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.SingleSelectionModel]

}
