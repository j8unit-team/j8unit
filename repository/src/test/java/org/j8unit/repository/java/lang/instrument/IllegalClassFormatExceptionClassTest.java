package org.j8unit.repository.java.lang.instrument;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalClassFormatExceptionClassTest
implements org.j8unit.repository.java.lang.instrument.IllegalClassFormatExceptionClassTests<java.lang.instrument.IllegalClassFormatException> {

    @Override
    public Class<java.lang.instrument.IllegalClassFormatException> createNewSUT() {
        return java.lang.instrument.IllegalClassFormatException.class;
    }

}
