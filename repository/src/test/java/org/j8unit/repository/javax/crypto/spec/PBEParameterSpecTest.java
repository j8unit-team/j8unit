package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.PBEParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PBEParameterSpec} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.PBEParameterSpecTests}).
 */

@RunWith(J8Unit4.class)
public class PBEParameterSpecTest
implements PBEParameterSpecTests<PBEParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.PBEParameterSpec]

    @Override
    public PBEParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.spec.PBEParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.PBEParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.PBEParameterSpec]

}
