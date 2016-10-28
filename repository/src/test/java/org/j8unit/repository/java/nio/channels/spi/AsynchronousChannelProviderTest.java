package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AsynchronousChannelProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousChannelProviderTest
implements org.j8unit.repository.java.nio.channels.spi.AsynchronousChannelProviderTests<AsynchronousChannelProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.spi.AsynchronousChannelProvider]

    @Override
    public AsynchronousChannelProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.spi.AsynchronousChannelProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.spi.AsynchronousChannelProvider]

}
