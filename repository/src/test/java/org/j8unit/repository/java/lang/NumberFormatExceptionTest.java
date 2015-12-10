package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NumberFormatExceptionTest
implements org.j8unit.repository.java.lang.NumberFormatExceptionTests<java.lang.NumberFormatException> {

    @Override
    public java.lang.NumberFormatException createNewSUT() {
        return new java.lang.NumberFormatException();
    }

}
