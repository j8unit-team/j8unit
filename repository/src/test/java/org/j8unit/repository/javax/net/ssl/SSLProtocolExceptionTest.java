package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLProtocolException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLProtocolExceptionTest
implements org.j8unit.repository.javax.net.ssl.SSLProtocolExceptionTests<SSLProtocolException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLProtocolException]

    @Override
    public SSLProtocolException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.SSLProtocolException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLProtocolException]

}
