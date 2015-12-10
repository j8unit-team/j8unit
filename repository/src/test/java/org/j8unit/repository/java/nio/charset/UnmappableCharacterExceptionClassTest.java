package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmappableCharacterExceptionClassTest
implements org.j8unit.repository.java.nio.charset.UnmappableCharacterExceptionClassTests<java.nio.charset.UnmappableCharacterException> {

    @Override
    public Class<java.nio.charset.UnmappableCharacterException> createNewSUT() {
        return java.nio.charset.UnmappableCharacterException.class;
    }

}
