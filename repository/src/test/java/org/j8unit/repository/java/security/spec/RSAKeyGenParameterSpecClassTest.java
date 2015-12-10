package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAKeyGenParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.RSAKeyGenParameterSpecClassTests<java.security.spec.RSAKeyGenParameterSpec> {

    @Override
    public Class<java.security.spec.RSAKeyGenParameterSpec> createNewSUT() {
        return java.security.spec.RSAKeyGenParameterSpec.class;
    }

}
