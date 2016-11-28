package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeModel} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.tree.TreeModelClassTests}).
 */
@RunWith(J8Unit4.class)
public class TreeModelClassTest
implements TreeModelClassTests<TreeModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.TreeModel]

    @Override
    public Class<TreeModel> createNewSUT() {
        return TreeModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.TreeModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.TreeModel]

}
