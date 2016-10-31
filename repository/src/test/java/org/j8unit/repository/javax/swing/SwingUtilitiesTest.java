package org.j8unit.repository.javax.swing;

import javax.swing.SwingUtilities;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SwingUtilitiesTest
implements org.j8unit.repository.javax.swing.SwingUtilitiesTests<SwingUtilities> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SwingUtilities]

    @Override
    public SwingUtilities createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.SwingUtilities], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.SwingUtilities]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.SwingUtilities]

}
