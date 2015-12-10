package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalAccessExceptionClassTest
implements org.j8unit.repository.java.lang.IllegalAccessExceptionClassTests<java.lang.IllegalAccessException> {

    @Override
    public Class<java.lang.IllegalAccessException> createNewSUT() {
        return java.lang.IllegalAccessException.class;
    }

}
