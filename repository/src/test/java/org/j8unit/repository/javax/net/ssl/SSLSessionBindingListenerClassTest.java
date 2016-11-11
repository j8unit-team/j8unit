package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSessionBindingListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SSLSessionBindingListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SSLSessionBindingListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class SSLSessionBindingListenerClassTest
implements SSLSessionBindingListenerClassTests<SSLSessionBindingListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLSessionBindingListener]

    @Override
    public Class<SSLSessionBindingListener> createNewSUT() {
        return SSLSessionBindingListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLSessionBindingListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLSessionBindingListener]

}
