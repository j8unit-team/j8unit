package org.j8unit.repository.java.lang.instrument;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalClassFormatExceptionTest
implements org.j8unit.repository.java.lang.instrument.IllegalClassFormatExceptionTests<java.lang.instrument.IllegalClassFormatException> {

    @Override
    public java.lang.instrument.IllegalClassFormatException createNewSUT() {
        return new java.lang.instrument.IllegalClassFormatException();
    }

}
