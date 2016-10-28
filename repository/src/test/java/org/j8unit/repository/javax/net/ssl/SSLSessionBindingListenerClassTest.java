package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSessionBindingListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSessionBindingListenerClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSessionBindingListenerClassTests<SSLSessionBindingListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLSessionBindingListener]

    @Override
    public Class<SSLSessionBindingListener> createNewSUT() {
        return SSLSessionBindingListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLSessionBindingListener]

}
