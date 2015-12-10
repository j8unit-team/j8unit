package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NonReadableChannelExceptionClassTest
implements org.j8unit.repository.java.nio.channels.NonReadableChannelExceptionClassTests<java.nio.channels.NonReadableChannelException> {

    @Override
    public Class<java.nio.channels.NonReadableChannelException> createNewSUT() {
        return java.nio.channels.NonReadableChannelException.class;
    }

}
