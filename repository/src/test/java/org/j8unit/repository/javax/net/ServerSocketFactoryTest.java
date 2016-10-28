package org.j8unit.repository.javax.net;

import javax.net.ServerSocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerSocketFactoryTest
implements org.j8unit.repository.javax.net.ServerSocketFactoryTests<ServerSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ServerSocketFactory]

    @Override
    public ServerSocketFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ServerSocketFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ServerSocketFactory]

}
