package org.j8unit.repository.java.awt;

import java.awt.Composite;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeTest
implements org.j8unit.repository.java.awt.CompositeTests<Composite> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Composite]

    @Override
    public Composite createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Composite], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Composite]

}
