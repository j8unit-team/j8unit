package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedCharsetExceptionClassTest
implements org.j8unit.repository.java.nio.charset.UnsupportedCharsetExceptionClassTests<java.nio.charset.UnsupportedCharsetException> {

    @Override
    public Class<java.nio.charset.UnsupportedCharsetException> createNewSUT() {
        return java.nio.charset.UnsupportedCharsetException.class;
    }

}
