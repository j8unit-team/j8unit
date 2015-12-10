package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NonWritableChannelExceptionTest
implements org.j8unit.repository.java.nio.channels.NonWritableChannelExceptionTests<java.nio.channels.NonWritableChannelException> {

    @Override
    public java.nio.channels.NonWritableChannelException createNewSUT() {
        return new java.nio.channels.NonWritableChannelException();
    }

}
