package org.j8unit.repository.java.awt;

import java.awt.Toolkit;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToolkitTest
implements org.j8unit.repository.java.awt.ToolkitTests<Toolkit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Toolkit]

    @Override
    public Toolkit createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Toolkit], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Toolkit]

}
