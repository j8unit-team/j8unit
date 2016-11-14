package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeModel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.TreeModelTests}).
 */

@RunWith(J8Unit4.class)
public class TreeModelTest
implements TreeModelTests<TreeModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.TreeModel]

    @Override
    public TreeModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.tree.TreeModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.TreeModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.TreeModel]

}
