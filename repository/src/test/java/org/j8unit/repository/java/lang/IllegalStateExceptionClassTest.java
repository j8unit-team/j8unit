package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalStateExceptionClassTest
implements org.j8unit.repository.java.lang.IllegalStateExceptionClassTests<java.lang.IllegalStateException> {

    @Override
    public Class<java.lang.IllegalStateException> createNewSUT() {
        return java.lang.IllegalStateException.class;
    }

}
