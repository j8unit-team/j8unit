package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntegerTest
implements org.j8unit.repository.java.lang.IntegerTests<java.lang.Integer> {

    @Override
    public java.lang.Integer createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.Integer] available.");
    }

}
