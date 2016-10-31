package org.j8unit.repository.javax.net;

import javax.net.SocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketFactoryTest
implements org.j8unit.repository.javax.net.SocketFactoryTests<SocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.SocketFactory]

    @Override
    public SocketFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.SocketFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.SocketFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.SocketFactory]

}
