package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.ExtendedSSLSession;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExtendedSSLSessionTest
implements org.j8unit.repository.javax.net.ssl.ExtendedSSLSessionTests<ExtendedSSLSession> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.ExtendedSSLSession]

    @Override
    public ExtendedSSLSession createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.ExtendedSSLSession], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.ExtendedSSLSession]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.ExtendedSSLSession]

}
