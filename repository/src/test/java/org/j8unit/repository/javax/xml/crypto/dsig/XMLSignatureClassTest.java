package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignature.SignatureValue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLSignature} (by simply reusing the
 * J8Unit test interface {@link XMLSignatureClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLSignatureClassTest
implements XMLSignatureClassTests<XMLSignature> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature]

    @Override
    public Class<XMLSignature> createNewSUT() {
        return XMLSignature.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link SignatureValue} (by simply reusing
     * the J8Unit test interface {@link SignatureValueClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SignatureValueClassTest
    implements SignatureValueClassTests<SignatureValue> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature$SignatureValue]

        @Override
        public Class<SignatureValue> createNewSUT() {
            return SignatureValue.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature$SignatureValue]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.XMLSignature$SignatureValue]

    }

}
