package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSessionContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SSLSessionContext} (by simply reusing the
 * J8Unit test interface {@link SSLSessionContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class SSLSessionContextClassTest
implements SSLSessionContextClassTests<SSLSessionContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLSessionContext]

    @Override
    public Class<SSLSessionContext> createNewSUT() {
        return SSLSessionContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLSessionContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLSessionContext]

}
