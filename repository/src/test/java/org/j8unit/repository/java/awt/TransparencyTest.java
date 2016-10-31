package org.j8unit.repository.java.awt;

import java.awt.Transparency;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransparencyTest
implements org.j8unit.repository.java.awt.TransparencyTests<Transparency> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Transparency]

    @Override
    public Transparency createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Transparency], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Transparency]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Transparency]

}
