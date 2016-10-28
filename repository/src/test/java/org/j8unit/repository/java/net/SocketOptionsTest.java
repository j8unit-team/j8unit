package org.j8unit.repository.java.net;

import java.net.SocketOptions;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketOptionsTest
implements org.j8unit.repository.java.net.SocketOptionsTests<SocketOptions> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.SocketOptions]

    @Override
    public SocketOptions createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.SocketOptions], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.SocketOptions]

}
