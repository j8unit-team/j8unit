package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.TreeModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeModelClassTest
implements org.j8unit.repository.javax.swing.tree.TreeModelClassTests<TreeModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.TreeModel]

    @Override
    public Class<TreeModel> createNewSUT() {
        return TreeModel.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.TreeModel]

}
