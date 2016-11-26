package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.SignatureMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SignatureMethod} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.SignatureMethodTests}).
 */
@RunWith(J8Unit4.class)
public class SignatureMethodTest
implements SignatureMethodTests<SignatureMethod> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.SignatureMethod]

    @Override
    public SignatureMethod createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.SignatureMethod], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.SignatureMethod]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.SignatureMethod]

}
