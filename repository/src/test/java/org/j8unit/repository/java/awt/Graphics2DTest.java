package org.j8unit.repository.java.awt;

import java.awt.Graphics2D;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Graphics2DTest
implements org.j8unit.repository.java.awt.Graphics2DTests<Graphics2D> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Graphics2D]

    @Override
    public Graphics2D createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Graphics2D], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Graphics2D]

}
