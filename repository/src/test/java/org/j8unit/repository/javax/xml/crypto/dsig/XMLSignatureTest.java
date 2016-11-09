package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignature.SignatureValue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLSignature} (by simply reusing the
 * J8Unit test interface {@link XMLSignatureTests}).
 */

@RunWith(J8Unit4.class)
public class XMLSignatureTest
implements XMLSignatureTests<XMLSignature> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignature]

    @Override
    public XMLSignature createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.XMLSignature], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignature]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignature]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link SignatureValue} (by simply
     * reusing the J8Unit test interface {@link SignatureValueTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SignatureValueTest
    implements SignatureValueTests<SignatureValue> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignature$SignatureValue]

        @Override
        public SignatureValue createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.XMLSignature.SignatureValue], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignature$SignatureValue]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignature$SignatureValue]

    }

}
