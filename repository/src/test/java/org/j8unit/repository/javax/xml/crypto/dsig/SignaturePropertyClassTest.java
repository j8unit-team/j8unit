package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.SignatureProperty;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SignatureProperty} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.SignaturePropertyClassTests}).
 */

@RunWith(J8Unit4.class)
public class SignaturePropertyClassTest
implements SignaturePropertyClassTests<SignatureProperty> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.SignatureProperty]

    @Override
    public Class<SignatureProperty> createNewSUT() {
        return SignatureProperty.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.SignatureProperty]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.SignatureProperty]

}
