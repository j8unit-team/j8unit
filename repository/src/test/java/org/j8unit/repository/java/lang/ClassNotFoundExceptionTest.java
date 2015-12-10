package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassNotFoundExceptionTest
implements org.j8unit.repository.java.lang.ClassNotFoundExceptionTests<java.lang.ClassNotFoundException> {

    @Override
    public java.lang.ClassNotFoundException createNewSUT() {
        return new java.lang.ClassNotFoundException();
    }

}
