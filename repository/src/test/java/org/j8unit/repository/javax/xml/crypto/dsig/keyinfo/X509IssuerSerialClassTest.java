package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509IssuerSerial} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.X509IssuerSerialClassTests}).
 */
@RunWith(J8Unit4.class)
public class X509IssuerSerialClassTest
implements X509IssuerSerialClassTests<X509IssuerSerial> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.X509IssuerSerial]

    @Override
    public Class<X509IssuerSerial> createNewSUT() {
        return X509IssuerSerial.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.X509IssuerSerial]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.X509IssuerSerial]

}
