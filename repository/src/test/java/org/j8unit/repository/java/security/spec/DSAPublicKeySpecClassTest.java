package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPublicKeySpecClassTest
implements org.j8unit.repository.java.security.spec.DSAPublicKeySpecClassTests<java.security.spec.DSAPublicKeySpec> {

    @Override
    public Class<java.security.spec.DSAPublicKeySpec> createNewSUT() {
        return java.security.spec.DSAPublicKeySpec.class;
    }

}
