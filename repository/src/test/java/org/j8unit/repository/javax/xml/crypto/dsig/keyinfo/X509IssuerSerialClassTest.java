package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509IssuerSerialClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.X509IssuerSerialClassTests<X509IssuerSerial> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.X509IssuerSerial]

    @Override
    public Class<X509IssuerSerial> createNewSUT() {
        return X509IssuerSerial.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.X509IssuerSerial]

}
