package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.TrustManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrustManagerTest
implements org.j8unit.repository.javax.net.ssl.TrustManagerTests<TrustManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.TrustManager]

    @Override
    public TrustManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.TrustManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.TrustManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.TrustManager]

}
