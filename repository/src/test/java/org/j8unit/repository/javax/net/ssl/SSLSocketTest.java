package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSocket;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSocketTest
implements org.j8unit.repository.javax.net.ssl.SSLSocketTests<SSLSocket> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLSocket]

    @Override
    public SSLSocket createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SSLSocket], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLSocket]

}
