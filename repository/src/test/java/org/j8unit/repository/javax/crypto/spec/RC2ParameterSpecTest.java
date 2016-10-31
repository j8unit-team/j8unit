package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.RC2ParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RC2ParameterSpecTest
implements org.j8unit.repository.javax.crypto.spec.RC2ParameterSpecTests<RC2ParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.RC2ParameterSpec]

    @Override
    public RC2ParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.spec.RC2ParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.RC2ParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.RC2ParameterSpec]

}
