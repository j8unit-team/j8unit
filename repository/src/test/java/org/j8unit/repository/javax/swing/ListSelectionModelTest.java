package org.j8unit.repository.javax.swing;

import javax.swing.ListSelectionModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ListSelectionModel} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.ListSelectionModelTests}).
 */
@RunWith(J8Unit4.class)
public class ListSelectionModelTest
implements ListSelectionModelTests<ListSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ListSelectionModel]

    @Override
    public ListSelectionModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.ListSelectionModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ListSelectionModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ListSelectionModel]

}
