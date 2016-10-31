package org.j8unit.repository.java.awt;

import java.awt.SecondaryLoop;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecondaryLoopTest
implements org.j8unit.repository.java.awt.SecondaryLoopTests<SecondaryLoop> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.SecondaryLoop]

    @Override
    public SecondaryLoop createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.SecondaryLoop], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.SecondaryLoop]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.SecondaryLoop]

}
