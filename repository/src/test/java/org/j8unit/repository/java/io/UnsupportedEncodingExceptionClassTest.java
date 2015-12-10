package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedEncodingExceptionClassTest
implements org.j8unit.repository.java.io.UnsupportedEncodingExceptionClassTests<java.io.UnsupportedEncodingException> {

    @Override
    public Class<java.io.UnsupportedEncodingException> createNewSUT() {
        return java.io.UnsupportedEncodingException.class;
    }

}
