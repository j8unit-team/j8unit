package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArithmeticExceptionClassTest
implements org.j8unit.repository.java.lang.ArithmeticExceptionClassTests<java.lang.ArithmeticException> {

    @Override
    public Class<java.lang.ArithmeticException> createNewSUT() {
        return java.lang.ArithmeticException.class;
    }

}
