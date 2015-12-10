package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSessionBindingListenerClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSessionBindingListenerClassTests<javax.net.ssl.SSLSessionBindingListener> {

    @Override
    public Class<javax.net.ssl.SSLSessionBindingListener> createNewSUT() {
        return javax.net.ssl.SSLSessionBindingListener.class;
    }

}
