package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArithmeticExceptionTest
implements org.j8unit.repository.java.lang.ArithmeticExceptionTests<java.lang.ArithmeticException> {

    @Override
    public java.lang.ArithmeticException createNewSUT() {
        return new java.lang.ArithmeticException();
    }

}
