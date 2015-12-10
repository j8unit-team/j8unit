package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmappableCharacterExceptionTest
implements org.j8unit.repository.java.nio.charset.UnmappableCharacterExceptionTests<java.nio.charset.UnmappableCharacterException> {

    @Override
    public java.nio.charset.UnmappableCharacterException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.nio.charset.UnmappableCharacterException] available.");
    }

}
