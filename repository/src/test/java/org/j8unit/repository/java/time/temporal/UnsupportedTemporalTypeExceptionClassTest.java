package org.j8unit.repository.java.time.temporal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedTemporalTypeExceptionClassTest
implements org.j8unit.repository.java.time.temporal.UnsupportedTemporalTypeExceptionClassTests<java.time.temporal.UnsupportedTemporalTypeException> {

    @Override
    public Class<java.time.temporal.UnsupportedTemporalTypeException> createNewSUT() {
        return java.time.temporal.UnsupportedTemporalTypeException.class;
    }

}
