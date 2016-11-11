package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link C14NMethodParameterSpec} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.C14NMethodParameterSpecTests}).
 */

@RunWith(J8Unit4.class)
public class C14NMethodParameterSpecTest
implements C14NMethodParameterSpecTests<C14NMethodParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.spec.C14NMethodParameterSpec]

    @Override
    public C14NMethodParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.spec.C14NMethodParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.spec.C14NMethodParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.spec.C14NMethodParameterSpec]

}
