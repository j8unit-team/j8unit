package org.j8unit.repository.java.security.spec;

import java.security.spec.ECGenParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECGenParameterSpecTest
implements org.j8unit.repository.java.security.spec.ECGenParameterSpecTests<ECGenParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.ECGenParameterSpec]

    @Override
    public ECGenParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.ECGenParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.ECGenParameterSpec]

}
