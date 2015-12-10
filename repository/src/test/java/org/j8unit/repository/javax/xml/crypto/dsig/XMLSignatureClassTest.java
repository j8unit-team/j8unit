package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLSignatureClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureClassTests<javax.xml.crypto.dsig.XMLSignature> {

    @RunWith(J8Unit4.class)
    public static class SignatureValueClassTest
    implements org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureClassTests.SignatureValueClassTests<javax.xml.crypto.dsig.XMLSignature.SignatureValue> {

        @Override
        public Class<javax.xml.crypto.dsig.XMLSignature.SignatureValue> createNewSUT() {
            return javax.xml.crypto.dsig.XMLSignature.SignatureValue.class;
        }

    }

    @Override
    public Class<javax.xml.crypto.dsig.XMLSignature> createNewSUT() {
        return javax.xml.crypto.dsig.XMLSignature.class;
    }

}
