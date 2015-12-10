package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.ECParameterSpecClassTests<java.security.spec.ECParameterSpec> {

    @Override
    public Class<java.security.spec.ECParameterSpec> createNewSUT() {
        return java.security.spec.ECParameterSpec.class;
    }

}
