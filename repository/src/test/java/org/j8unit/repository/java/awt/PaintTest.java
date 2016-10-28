package org.j8unit.repository.java.awt;

import java.awt.Paint;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PaintTest
implements org.j8unit.repository.java.awt.PaintTests<Paint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Paint]

    @Override
    public Paint createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Paint], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Paint]

}
