package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IndexOutOfBoundsExceptionTest
implements org.j8unit.repository.java.lang.IndexOutOfBoundsExceptionTests<java.lang.IndexOutOfBoundsException> {

    @Override
    public java.lang.IndexOutOfBoundsException createNewSUT() {
        return new java.lang.IndexOutOfBoundsException();
    }

}
