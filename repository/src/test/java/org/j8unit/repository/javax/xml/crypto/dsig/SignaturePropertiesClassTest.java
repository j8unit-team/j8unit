package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.SignatureProperties;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignaturePropertiesClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.SignaturePropertiesClassTests<SignatureProperties> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.SignatureProperties]

    @Override
    public Class<SignatureProperties> createNewSUT() {
        return SignatureProperties.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.SignatureProperties]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.SignatureProperties]

}
