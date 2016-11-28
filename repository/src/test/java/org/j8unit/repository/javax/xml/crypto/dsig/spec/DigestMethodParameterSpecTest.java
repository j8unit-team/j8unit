package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DigestMethodParameterSpec} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.DigestMethodParameterSpecTests}).
 */
@RunWith(J8Unit4.class)
public class DigestMethodParameterSpecTest
implements DigestMethodParameterSpecTests<DigestMethodParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.DigestMethodParameterSpec]

    @Override
    public DigestMethodParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.spec.DigestMethodParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.spec.DigestMethodParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.spec.DigestMethodParameterSpec]

}
