package org.j8unit.repository.javax.crypto;

import javax.crypto.KeyAgreement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyAgreement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.crypto.KeyAgreementTests}).
 */

@RunWith(J8Unit4.class)
public class KeyAgreementTest
implements KeyAgreementTests<KeyAgreement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.KeyAgreement]

    @Override
    public KeyAgreement createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.KeyAgreement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.KeyAgreement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.KeyAgreement]

}
