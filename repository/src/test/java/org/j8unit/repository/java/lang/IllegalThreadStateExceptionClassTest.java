package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalThreadStateExceptionClassTest
implements org.j8unit.repository.java.lang.IllegalThreadStateExceptionClassTests<java.lang.IllegalThreadStateException> {

    @Override
    public Class<java.lang.IllegalThreadStateException> createNewSUT() {
        return java.lang.IllegalThreadStateException.class;
    }

}
