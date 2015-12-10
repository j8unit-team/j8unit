package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignaturePropertiesClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.SignaturePropertiesClassTests<javax.xml.crypto.dsig.SignatureProperties> {

    @Override
    public Class<javax.xml.crypto.dsig.SignatureProperties> createNewSUT() {
        return javax.xml.crypto.dsig.SignatureProperties.class;
    }

}
