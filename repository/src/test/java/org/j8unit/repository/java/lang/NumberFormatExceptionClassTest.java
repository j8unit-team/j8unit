package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NumberFormatExceptionClassTest
implements org.j8unit.repository.java.lang.NumberFormatExceptionClassTests<java.lang.NumberFormatException> {

    @Override
    public Class<java.lang.NumberFormatException> createNewSUT() {
        return java.lang.NumberFormatException.class;
    }

}
