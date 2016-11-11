package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link C14NMethodParameterSpec} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.C14NMethodParameterSpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class C14NMethodParameterSpecClassTest
implements C14NMethodParameterSpecClassTests<C14NMethodParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.C14NMethodParameterSpec]

    @Override
    public Class<C14NMethodParameterSpec> createNewSUT() {
        return C14NMethodParameterSpec.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.C14NMethodParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.C14NMethodParameterSpec]

}
