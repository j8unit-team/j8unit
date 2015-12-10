package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RC2ParameterSpecTest
implements org.j8unit.repository.javax.crypto.spec.RC2ParameterSpecTests<javax.crypto.spec.RC2ParameterSpec> {

    @Override
    public javax.crypto.spec.RC2ParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.spec.RC2ParameterSpec] available.");
    }

}
