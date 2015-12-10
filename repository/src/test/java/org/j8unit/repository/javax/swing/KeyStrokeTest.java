package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStrokeTest
implements org.j8unit.repository.javax.swing.KeyStrokeTests<javax.swing.KeyStroke> {

    @Override
    public javax.swing.KeyStroke createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.KeyStroke] available.");
    }

}
