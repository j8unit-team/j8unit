package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NegativeArraySizeExceptionClassTest
implements org.j8unit.repository.java.lang.NegativeArraySizeExceptionClassTests<java.lang.NegativeArraySizeException> {

    @Override
    public Class<java.lang.NegativeArraySizeException> createNewSUT() {
        return java.lang.NegativeArraySizeException.class;
    }

}
