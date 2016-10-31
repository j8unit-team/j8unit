package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXAuthenticator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXAuthenticatorClassTest
implements org.j8unit.repository.javax.management.remote.JMXAuthenticatorClassTests<JMXAuthenticator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXAuthenticator]

    @Override
    public Class<JMXAuthenticator> createNewSUT() {
        return JMXAuthenticator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXAuthenticator]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXAuthenticator]

}
