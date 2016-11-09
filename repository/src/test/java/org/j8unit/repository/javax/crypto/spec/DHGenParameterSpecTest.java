package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.DHGenParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DHGenParameterSpec} (by simply
 * reusing the J8Unit test interface {@link DHGenParameterSpecTests}).
 */

@RunWith(J8Unit4.class)
public class DHGenParameterSpecTest
implements DHGenParameterSpecTests<DHGenParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.DHGenParameterSpec]

    @Override
    public DHGenParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.spec.DHGenParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.DHGenParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.DHGenParameterSpec]

}
