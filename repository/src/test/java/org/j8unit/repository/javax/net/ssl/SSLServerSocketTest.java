package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLServerSocket;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLServerSocketTest
implements org.j8unit.repository.javax.net.ssl.SSLServerSocketTests<SSLServerSocket> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLServerSocket]

    @Override
    public SSLServerSocket createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SSLServerSocket], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLServerSocket]

}
