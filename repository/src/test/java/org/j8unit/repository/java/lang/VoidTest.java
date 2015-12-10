package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VoidTest
implements org.j8unit.repository.java.lang.VoidTests<java.lang.Void> {

    @Override
    public java.lang.Void createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.Void] available.");
    }

}
