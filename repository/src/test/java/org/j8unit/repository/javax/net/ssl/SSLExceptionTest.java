package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLExceptionTest
implements org.j8unit.repository.javax.net.ssl.SSLExceptionTests<SSLException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLException]

    @Override
    public SSLException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.SSLException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.SSLException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.SSLException]

}
