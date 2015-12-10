package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NonWritableChannelExceptionClassTest
implements org.j8unit.repository.java.nio.channels.NonWritableChannelExceptionClassTests<java.nio.channels.NonWritableChannelException> {

    @Override
    public Class<java.nio.channels.NonWritableChannelException> createNewSUT() {
        return java.nio.channels.NonWritableChannelException.class;
    }

}
