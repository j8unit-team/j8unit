package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslServer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SaslServer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.security.sasl.SaslServerClassTests}).
 */

@RunWith(J8Unit4.class)
public class SaslServerClassTest
implements SaslServerClassTests<SaslServer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.SaslServer]

    @Override
    public Class<SaslServer> createNewSUT() {
        return SaslServer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.sasl.SaslServer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.SaslServer]

}
