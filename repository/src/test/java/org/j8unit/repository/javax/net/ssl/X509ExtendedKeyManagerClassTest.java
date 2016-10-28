package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509ExtendedKeyManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509ExtendedKeyManagerClassTest
implements org.j8unit.repository.javax.net.ssl.X509ExtendedKeyManagerClassTests<X509ExtendedKeyManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.X509ExtendedKeyManager]

    @Override
    public Class<X509ExtendedKeyManager> createNewSUT() {
        return X509ExtendedKeyManager.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.X509ExtendedKeyManager]

}
