package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalCharsetNameExceptionTest
implements org.j8unit.repository.java.nio.charset.IllegalCharsetNameExceptionTests<java.nio.charset.IllegalCharsetNameException> {

    @Override
    public java.nio.charset.IllegalCharsetNameException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.nio.charset.IllegalCharsetNameException] available.");
    }

}
