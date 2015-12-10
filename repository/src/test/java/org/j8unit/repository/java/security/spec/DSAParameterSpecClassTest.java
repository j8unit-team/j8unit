package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.DSAParameterSpecClassTests<java.security.spec.DSAParameterSpec> {

    @Override
    public Class<java.security.spec.DSAParameterSpec> createNewSUT() {
        return java.security.spec.DSAParameterSpec.class;
    }

}
