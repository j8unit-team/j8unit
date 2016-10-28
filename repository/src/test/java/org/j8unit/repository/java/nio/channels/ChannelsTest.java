package org.j8unit.repository.java.nio.channels;

import java.nio.channels.Channels;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChannelsTest
implements org.j8unit.repository.java.nio.channels.ChannelsTests<Channels> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Channels]

    @Override
    public Channels createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.channels.Channels], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Channels]

}
