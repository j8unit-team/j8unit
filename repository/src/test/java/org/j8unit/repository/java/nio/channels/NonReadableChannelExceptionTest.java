package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NonReadableChannelExceptionTest
implements org.j8unit.repository.java.nio.channels.NonReadableChannelExceptionTests<java.nio.channels.NonReadableChannelException> {

    @Override
    public java.nio.channels.NonReadableChannelException createNewSUT() {
        return new java.nio.channels.NonReadableChannelException();
    }

}
