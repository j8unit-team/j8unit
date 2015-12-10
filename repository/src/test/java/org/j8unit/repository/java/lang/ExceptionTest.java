package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExceptionTest
implements org.j8unit.repository.java.lang.ExceptionTests<java.lang.Exception> {

    @Override
    public java.lang.Exception createNewSUT() {
        return new java.lang.Exception();
    }

}
