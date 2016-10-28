package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.GCMParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GCMParameterSpecTest
implements org.j8unit.repository.javax.crypto.spec.GCMParameterSpecTests<GCMParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.GCMParameterSpec]

    @Override
    public GCMParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.spec.GCMParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.GCMParameterSpec]

}
