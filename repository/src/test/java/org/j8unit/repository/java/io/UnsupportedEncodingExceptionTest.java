package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedEncodingExceptionTest
implements org.j8unit.repository.java.io.UnsupportedEncodingExceptionTests<java.io.UnsupportedEncodingException> {

    @Override
    public java.io.UnsupportedEncodingException createNewSUT() {
        return new java.io.UnsupportedEncodingException();
    }

}
