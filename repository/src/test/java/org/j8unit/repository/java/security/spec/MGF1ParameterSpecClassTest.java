package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MGF1ParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.MGF1ParameterSpecClassTests<java.security.spec.MGF1ParameterSpec> {

    @Override
    public Class<java.security.spec.MGF1ParameterSpec> createNewSUT() {
        return java.security.spec.MGF1ParameterSpec.class;
    }

}
