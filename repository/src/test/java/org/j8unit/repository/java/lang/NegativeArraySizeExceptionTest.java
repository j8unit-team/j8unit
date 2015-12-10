package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NegativeArraySizeExceptionTest
implements org.j8unit.repository.java.lang.NegativeArraySizeExceptionTests<java.lang.NegativeArraySizeException> {

    @Override
    public java.lang.NegativeArraySizeException createNewSUT() {
        return new java.lang.NegativeArraySizeException();
    }

}
