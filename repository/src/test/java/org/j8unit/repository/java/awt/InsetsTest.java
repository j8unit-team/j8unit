package org.j8unit.repository.java.awt;

import java.awt.Insets;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InsetsTest
implements org.j8unit.repository.java.awt.InsetsTests<Insets> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Insets]

    @Override
    public Insets createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.Insets], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Insets]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Insets]

}
