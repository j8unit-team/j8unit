package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeSelectionModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeSelectionModel} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.TreeSelectionModelTests}).
 */
@RunWith(J8Unit4.class)
public class TreeSelectionModelTest
implements TreeSelectionModelTests<TreeSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.TreeSelectionModel]

    @Override
    public TreeSelectionModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.tree.TreeSelectionModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.TreeSelectionModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.TreeSelectionModel]

}
