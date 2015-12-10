package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadOnlyBufferExceptionClassTest
implements org.j8unit.repository.java.nio.ReadOnlyBufferExceptionClassTests<java.nio.ReadOnlyBufferException> {

    @Override
    public Class<java.nio.ReadOnlyBufferException> createNewSUT() {
        return java.nio.ReadOnlyBufferException.class;
    }

}
