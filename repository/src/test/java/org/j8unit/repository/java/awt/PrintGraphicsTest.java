package org.j8unit.repository.java.awt;

import java.awt.PrintGraphics;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintGraphicsTest
implements org.j8unit.repository.java.awt.PrintGraphicsTests<PrintGraphics> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PrintGraphics]

    @Override
    public PrintGraphics createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.PrintGraphics], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.PrintGraphics]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.PrintGraphics]

}
