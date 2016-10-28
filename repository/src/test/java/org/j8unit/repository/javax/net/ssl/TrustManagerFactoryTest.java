package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.TrustManagerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrustManagerFactoryTest
implements org.j8unit.repository.javax.net.ssl.TrustManagerFactoryTests<TrustManagerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.TrustManagerFactory]

    @Override
    public TrustManagerFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.TrustManagerFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.TrustManagerFactory]

}
