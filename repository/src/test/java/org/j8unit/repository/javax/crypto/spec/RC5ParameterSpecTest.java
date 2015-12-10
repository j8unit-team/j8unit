package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RC5ParameterSpecTest
implements org.j8unit.repository.javax.crypto.spec.RC5ParameterSpecTests<javax.crypto.spec.RC5ParameterSpec> {

    @Override
    public javax.crypto.spec.RC5ParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.spec.RC5ParameterSpec] available.");
    }

}
