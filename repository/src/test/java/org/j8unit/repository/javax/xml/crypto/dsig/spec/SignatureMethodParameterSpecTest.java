package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SignatureMethodParameterSpec} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.SignatureMethodParameterSpecTests}).
 */
@RunWith(J8Unit4.class)
public class SignatureMethodParameterSpecTest
implements SignatureMethodParameterSpecTests<SignatureMethodParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec]

    @Override
    public SignatureMethodParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec]

}
