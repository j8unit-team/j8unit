package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SNIServerName;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SNIServerName} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SNIServerNameClassTests}).
 */

@RunWith(J8Unit4.class)
public class SNIServerNameClassTest
implements SNIServerNameClassTests<SNIServerName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SNIServerName]

    @Override
    public Class<SNIServerName> createNewSUT() {
        return SNIServerName.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SNIServerName]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SNIServerName]

}
