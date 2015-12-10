package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalCharsetNameExceptionClassTest
implements org.j8unit.repository.java.nio.charset.IllegalCharsetNameExceptionClassTests<java.nio.charset.IllegalCharsetNameException> {

    @Override
    public Class<java.nio.charset.IllegalCharsetNameException> createNewSUT() {
        return java.nio.charset.IllegalCharsetNameException.class;
    }

}
