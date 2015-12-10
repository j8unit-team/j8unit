package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MissingFormatWidthExceptionTest
implements org.j8unit.repository.java.util.MissingFormatWidthExceptionTests<java.util.MissingFormatWidthException> {

    @Override
    public java.util.MissingFormatWidthException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.MissingFormatWidthException] available.");
    }

}
