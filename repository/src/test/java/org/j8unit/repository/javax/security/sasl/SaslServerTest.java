package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslServer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SaslServer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.sasl.SaslServerTests}).
 */

@RunWith(J8Unit4.class)
public class SaslServerTest
implements SaslServerTests<SaslServer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.SaslServer]

    @Override
    public SaslServer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.sasl.SaslServer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.sasl.SaslServer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.sasl.SaslServer]

}
