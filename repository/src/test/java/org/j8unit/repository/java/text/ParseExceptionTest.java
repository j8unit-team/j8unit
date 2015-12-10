package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParseExceptionTest
implements org.j8unit.repository.java.text.ParseExceptionTests<java.text.ParseException> {

    @Override
    public java.text.ParseException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.text.ParseException] available.");
    }

}
