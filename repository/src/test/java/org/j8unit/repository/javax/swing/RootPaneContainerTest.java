package org.j8unit.repository.javax.swing;

import javax.swing.RootPaneContainer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RootPaneContainerTest
implements org.j8unit.repository.javax.swing.RootPaneContainerTests<RootPaneContainer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RootPaneContainer]

    @Override
    public RootPaneContainer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.RootPaneContainer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.RootPaneContainer]

}
