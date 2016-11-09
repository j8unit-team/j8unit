package org.j8unit.repository.java.security.spec;

import java.security.spec.DSAGenParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DSAGenParameterSpec} (by simply
 * reusing the J8Unit test interface {@link DSAGenParameterSpecTests}).
 */

@RunWith(J8Unit4.class)
public class DSAGenParameterSpecTest
implements DSAGenParameterSpecTests<DSAGenParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.DSAGenParameterSpec]

    @Override
    public DSAGenParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.DSAGenParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.DSAGenParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.DSAGenParameterSpec]

}
