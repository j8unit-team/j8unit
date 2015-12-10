package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MalformedInputExceptionClassTest
implements org.j8unit.repository.java.nio.charset.MalformedInputExceptionClassTests<java.nio.charset.MalformedInputException> {

    @Override
    public Class<java.nio.charset.MalformedInputException> createNewSUT() {
        return java.nio.charset.MalformedInputException.class;
    }

}
