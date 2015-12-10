package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NullPointerExceptionTest
implements org.j8unit.repository.java.lang.NullPointerExceptionTests<java.lang.NullPointerException> {

    @Override
    public java.lang.NullPointerException createNewSUT() {
        return new java.lang.NullPointerException();
    }

}
