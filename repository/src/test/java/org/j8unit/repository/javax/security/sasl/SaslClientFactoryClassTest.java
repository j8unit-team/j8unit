package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslClientFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SaslClientFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.sasl.SaslClientFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class SaslClientFactoryClassTest
implements SaslClientFactoryClassTests<SaslClientFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.SaslClientFactory]

    @Override
    public Class<SaslClientFactory> createNewSUT() {
        return SaslClientFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.sasl.SaslClientFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.SaslClientFactory]

}
