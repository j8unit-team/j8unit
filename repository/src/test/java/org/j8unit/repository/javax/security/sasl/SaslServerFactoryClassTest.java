package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslServerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SaslServerFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.sasl.SaslServerFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class SaslServerFactoryClassTest
implements SaslServerFactoryClassTests<SaslServerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.SaslServerFactory]

    @Override
    public Class<SaslServerFactory> createNewSUT() {
        return SaslServerFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.sasl.SaslServerFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.SaslServerFactory]

}
