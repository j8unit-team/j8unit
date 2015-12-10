package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECGenParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.ECGenParameterSpecClassTests<java.security.spec.ECGenParameterSpec> {

    @Override
    public Class<java.security.spec.ECGenParameterSpec> createNewSUT() {
        return java.security.spec.ECGenParameterSpec.class;
    }

}
