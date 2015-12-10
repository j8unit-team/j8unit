package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedOperationExceptionClassTest
implements org.j8unit.repository.java.lang.UnsupportedOperationExceptionClassTests<java.lang.UnsupportedOperationException> {

    @Override
    public Class<java.lang.UnsupportedOperationException> createNewSUT() {
        return java.lang.UnsupportedOperationException.class;
    }

}
