package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalArgumentExceptionClassTest
implements org.j8unit.repository.java.lang.IllegalArgumentExceptionClassTests<java.lang.IllegalArgumentException> {

    @Override
    public Class<java.lang.IllegalArgumentException> createNewSUT() {
        return java.lang.IllegalArgumentException.class;
    }

}
