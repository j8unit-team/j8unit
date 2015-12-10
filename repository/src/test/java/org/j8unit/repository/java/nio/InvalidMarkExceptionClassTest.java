package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidMarkExceptionClassTest
implements org.j8unit.repository.java.nio.InvalidMarkExceptionClassTests<java.nio.InvalidMarkException> {

    @Override
    public Class<java.nio.InvalidMarkException> createNewSUT() {
        return java.nio.InvalidMarkException.class;
    }

}
