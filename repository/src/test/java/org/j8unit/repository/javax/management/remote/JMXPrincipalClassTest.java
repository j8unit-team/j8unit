package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXPrincipalClassTest
implements org.j8unit.repository.javax.management.remote.JMXPrincipalClassTests<javax.management.remote.JMXPrincipal> {

    @Override
    public Class<javax.management.remote.JMXPrincipal> createNewSUT() {
        return javax.management.remote.JMXPrincipal.class;
    }

}
