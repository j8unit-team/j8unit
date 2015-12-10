package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GCMParameterSpecTest
implements org.j8unit.repository.javax.crypto.spec.GCMParameterSpecTests<javax.crypto.spec.GCMParameterSpec> {

    @Override
    public javax.crypto.spec.GCMParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.spec.GCMParameterSpec] available.");
    }

}
