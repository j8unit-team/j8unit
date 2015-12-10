package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXProviderExceptionTest
implements org.j8unit.repository.javax.management.remote.JMXProviderExceptionTests<javax.management.remote.JMXProviderException> {

    @Override
    public javax.management.remote.JMXProviderException createNewSUT() {
        return new javax.management.remote.JMXProviderException();
    }

}
