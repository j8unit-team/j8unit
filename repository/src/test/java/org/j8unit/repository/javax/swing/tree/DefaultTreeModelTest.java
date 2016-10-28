package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.DefaultTreeModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultTreeModelTest
implements org.j8unit.repository.javax.swing.tree.DefaultTreeModelTests<DefaultTreeModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeModel]

    @Override
    public DefaultTreeModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.tree.DefaultTreeModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeModel]

}
