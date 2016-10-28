package org.j8unit.repository.java.nio.channels;

import java.nio.channels.AsynchronousSocketChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsynchronousSocketChannelTest
implements org.j8unit.repository.java.nio.channels.AsynchronousSocketChannelTests<AsynchronousSocketChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.AsynchronousSocketChannel]

    @Override
    public AsynchronousSocketChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.AsynchronousSocketChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.AsynchronousSocketChannel]

}
