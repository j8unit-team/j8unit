package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXProviderExceptionClassTest
implements org.j8unit.repository.javax.management.remote.JMXProviderExceptionClassTests<javax.management.remote.JMXProviderException> {

    @Override
    public Class<javax.management.remote.JMXProviderException> createNewSUT() {
        return javax.management.remote.JMXProviderException.class;
    }

}