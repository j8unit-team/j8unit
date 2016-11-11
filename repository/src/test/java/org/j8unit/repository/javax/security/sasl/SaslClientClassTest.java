package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslClient;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SaslClient} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.security.sasl.SaslClientClassTests}).
 */

@RunWith(J8Unit4.class)
public class SaslClientClassTest
implements SaslClientClassTests<SaslClient> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.SaslClient]

    @Override
    public Class<SaslClient> createNewSUT() {
        return SaslClient.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.sasl.SaslClient]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.SaslClient]

}
