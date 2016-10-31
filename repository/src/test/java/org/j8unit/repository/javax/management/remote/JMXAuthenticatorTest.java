package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXAuthenticator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXAuthenticatorTest
implements org.j8unit.repository.javax.management.remote.JMXAuthenticatorTests<JMXAuthenticator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXAuthenticator]

    @Override
    public JMXAuthenticator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.JMXAuthenticator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXAuthenticator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXAuthenticator]

}
