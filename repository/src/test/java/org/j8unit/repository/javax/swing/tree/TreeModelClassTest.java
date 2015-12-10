package org.j8unit.repository.javax.swing.tree;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeModelClassTest
implements org.j8unit.repository.javax.swing.tree.TreeModelClassTests<javax.swing.tree.TreeModel> {

    @Override
    public Class<javax.swing.tree.TreeModel> createNewSUT() {
        return javax.swing.tree.TreeModel.class;
    }

}
