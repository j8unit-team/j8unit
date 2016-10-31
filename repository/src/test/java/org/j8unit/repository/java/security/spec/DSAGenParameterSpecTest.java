package org.j8unit.repository.java.security.spec;

import java.security.spec.DSAGenParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAGenParameterSpecTest
implements org.j8unit.repository.java.security.spec.DSAGenParameterSpecTests<DSAGenParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.DSAGenParameterSpec]

    @Override
    public DSAGenParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.DSAGenParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.DSAGenParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.DSAGenParameterSpec]

}
