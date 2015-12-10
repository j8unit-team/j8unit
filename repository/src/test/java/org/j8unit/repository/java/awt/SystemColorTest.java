package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SystemColorTest
implements org.j8unit.repository.java.awt.SystemColorTests<java.awt.SystemColor> {

    @Override
    public java.awt.SystemColor createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.SystemColor] available.");
    }

}
