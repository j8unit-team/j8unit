package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509KeyManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509KeyManagerTest
implements org.j8unit.repository.javax.net.ssl.X509KeyManagerTests<X509KeyManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.X509KeyManager]

    @Override
    public X509KeyManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.X509KeyManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.X509KeyManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.X509KeyManager]

}
