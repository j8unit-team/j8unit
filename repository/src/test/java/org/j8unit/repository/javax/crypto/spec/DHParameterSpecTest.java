package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.DHParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DHParameterSpec} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.DHParameterSpecTests}).
 */
@RunWith(J8Unit4.class)
public class DHParameterSpecTest
implements DHParameterSpecTests<DHParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.DHParameterSpec]

    @Override
    public DHParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.spec.DHParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.DHParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.DHParameterSpec]

}
