package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SignatureMethodParameterSpec} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.SignatureMethodParameterSpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class SignatureMethodParameterSpecClassTest
implements SignatureMethodParameterSpecClassTests<SignatureMethodParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec]

    @Override
    public Class<SignatureMethodParameterSpec> createNewSUT() {
        return SignatureMethodParameterSpec.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec]

}
