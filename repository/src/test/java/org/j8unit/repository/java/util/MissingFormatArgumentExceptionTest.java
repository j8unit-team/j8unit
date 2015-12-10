package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MissingFormatArgumentExceptionTest
implements org.j8unit.repository.java.util.MissingFormatArgumentExceptionTests<java.util.MissingFormatArgumentException> {

    @Override
    public java.util.MissingFormatArgumentException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.MissingFormatArgumentException] available.");
    }

}
