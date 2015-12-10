package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeExceptionClassTest
implements org.j8unit.repository.java.lang.RuntimeExceptionClassTests<java.lang.RuntimeException> {

    @Override
    public Class<java.lang.RuntimeException> createNewSUT() {
        return java.lang.RuntimeException.class;
    }

}
