package org.j8unit.repository.javax.swing;

import javax.swing.SwingConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SwingConstantsTest
implements org.j8unit.repository.javax.swing.SwingConstantsTests<SwingConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SwingConstants]

    @Override
    public SwingConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.SwingConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SwingConstants]

}
