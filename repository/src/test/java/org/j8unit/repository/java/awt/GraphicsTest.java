package org.j8unit.repository.java.awt;

import java.awt.Graphics;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GraphicsTest
implements org.j8unit.repository.java.awt.GraphicsTests<Graphics> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Graphics]

    @Override
    public Graphics createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Graphics], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Graphics]

}
