package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SwingUtilitiesTest
implements org.j8unit.repository.javax.swing.SwingUtilitiesTests<javax.swing.SwingUtilities> {

    @Override
    public javax.swing.SwingUtilities createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.SwingUtilities] available.");
    }

}
