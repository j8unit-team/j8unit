package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedTemporalTypeExceptionTest
implements org.j8unit.repository.java.time.temporal.UnsupportedTemporalTypeExceptionTests<java.time.temporal.UnsupportedTemporalTypeException> {

    @Override
    public java.time.temporal.UnsupportedTemporalTypeException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.temporal.UnsupportedTemporalTypeException] available.");
    }

}
