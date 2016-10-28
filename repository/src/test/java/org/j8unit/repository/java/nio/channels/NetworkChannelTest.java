package org.j8unit.repository.java.nio.channels;

import java.nio.channels.NetworkChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NetworkChannelTest
implements org.j8unit.repository.java.nio.channels.NetworkChannelTests<NetworkChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.NetworkChannel]

    @Override
    public NetworkChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.NetworkChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.NetworkChannel]

}
