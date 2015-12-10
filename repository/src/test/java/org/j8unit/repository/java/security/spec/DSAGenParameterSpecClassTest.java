package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAGenParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.DSAGenParameterSpecClassTests<java.security.spec.DSAGenParameterSpec> {

    @Override
    public Class<java.security.spec.DSAGenParameterSpec> createNewSUT() {
        return java.security.spec.DSAGenParameterSpec.class;
    }

}
