package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.SignatureMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SignatureMethod} (by simply reusing the
 * J8Unit test interface {@link SignatureMethodClassTests}).
 */

@RunWith(J8Unit4.class)
public class SignatureMethodClassTest
implements SignatureMethodClassTests<SignatureMethod> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.SignatureMethod]

    @Override
    public Class<SignatureMethod> createNewSUT() {
        return SignatureMethod.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.SignatureMethod]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.SignatureMethod]

}
