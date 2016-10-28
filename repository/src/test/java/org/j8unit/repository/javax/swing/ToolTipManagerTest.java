package org.j8unit.repository.javax.swing;

import javax.swing.ToolTipManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToolTipManagerTest
implements org.j8unit.repository.javax.swing.ToolTipManagerTests<ToolTipManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ToolTipManager]

    @Override
    public ToolTipManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.ToolTipManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ToolTipManager]

}
