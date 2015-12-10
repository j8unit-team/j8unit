package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BidiTest
implements org.j8unit.repository.java.text.BidiTests<java.text.Bidi> {

    @Override
    public java.text.Bidi createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.text.Bidi] available.");
    }

}
