package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignature.SignatureValue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLSignatureClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureClassTests<XMLSignature> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature]

    @Override
    public Class<XMLSignature> createNewSUT() {
        return XMLSignature.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature]

    @RunWith(J8Unit4.class)
    public static class SignatureValueClassTest
    implements org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureClassTests.SignatureValueClassTests<SignatureValue> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature$SignatureValue]

        @Override
        public Class<SignatureValue> createNewSUT() {
            return SignatureValue.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature$SignatureValue]

    }

}
