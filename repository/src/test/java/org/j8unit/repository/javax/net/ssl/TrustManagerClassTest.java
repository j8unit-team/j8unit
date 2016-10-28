package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.TrustManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrustManagerClassTest
implements org.j8unit.repository.javax.net.ssl.TrustManagerClassTests<TrustManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.TrustManager]

    @Override
    public Class<TrustManager> createNewSUT() {
        return TrustManager.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.TrustManager]

}
