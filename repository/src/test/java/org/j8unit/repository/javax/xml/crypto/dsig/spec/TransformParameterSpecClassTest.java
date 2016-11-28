package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TransformParameterSpec} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.TransformParameterSpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class TransformParameterSpecClassTest
implements TransformParameterSpecClassTests<TransformParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.TransformParameterSpec]

    @Override
    public Class<TransformParameterSpec> createNewSUT() {
        return TransformParameterSpec.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.TransformParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.TransformParameterSpec]

}
