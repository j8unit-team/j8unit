package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeSelectionModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeSelectionModel} (by simply reusing
 * the J8Unit test interface {@link TreeSelectionModelClassTests}).
 */

@RunWith(J8Unit4.class)
public class TreeSelectionModelClassTest
implements TreeSelectionModelClassTests<TreeSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.TreeSelectionModel]

    @Override
    public Class<TreeSelectionModel> createNewSUT() {
        return TreeSelectionModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.TreeSelectionModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.TreeSelectionModel]

}
