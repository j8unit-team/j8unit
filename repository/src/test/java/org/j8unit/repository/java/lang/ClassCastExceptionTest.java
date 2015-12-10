package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassCastExceptionTest
implements org.j8unit.repository.java.lang.ClassCastExceptionTests<java.lang.ClassCastException> {

    @Override
    public java.lang.ClassCastException createNewSUT() {
        return new java.lang.ClassCastException();
    }

}
