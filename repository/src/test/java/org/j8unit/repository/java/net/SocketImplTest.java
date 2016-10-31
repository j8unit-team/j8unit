package org.j8unit.repository.java.net;

import java.net.SocketImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketImplTest
implements org.j8unit.repository.java.net.SocketImplTests<SocketImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.SocketImpl]

    @Override
    public SocketImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.SocketImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.SocketImpl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.SocketImpl]

}
