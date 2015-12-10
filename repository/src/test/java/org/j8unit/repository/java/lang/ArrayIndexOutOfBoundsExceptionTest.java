package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayIndexOutOfBoundsExceptionTest
implements org.j8unit.repository.java.lang.ArrayIndexOutOfBoundsExceptionTests<java.lang.ArrayIndexOutOfBoundsException> {

    @Override
    public java.lang.ArrayIndexOutOfBoundsException createNewSUT() {
        return new java.lang.ArrayIndexOutOfBoundsException();
    }

}
