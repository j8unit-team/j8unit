package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousChannelProviderClassTest
implements org.j8unit.repository.java.nio.channels.spi.AsynchronousChannelProviderClassTests<java.nio.channels.spi.AsynchronousChannelProvider> {

    @Override
    public Class<java.nio.channels.spi.AsynchronousChannelProvider> createNewSUT() {
        return java.nio.channels.spi.AsynchronousChannelProvider.class;
    }

}
