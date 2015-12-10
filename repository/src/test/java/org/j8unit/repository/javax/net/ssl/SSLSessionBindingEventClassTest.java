package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSessionBindingEventClassTest
implements org.j8unit.repository.javax.net.ssl.SSLSessionBindingEventClassTests<javax.net.ssl.SSLSessionBindingEvent> {

    @Override
    public Class<javax.net.ssl.SSLSessionBindingEvent> createNewSUT() {
        return javax.net.ssl.SSLSessionBindingEvent.class;
    }

}
