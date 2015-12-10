package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPrivateKeySpecClassTest
implements org.j8unit.repository.java.security.spec.DSAPrivateKeySpecClassTests<java.security.spec.DSAPrivateKeySpec> {

    @Override
    public Class<java.security.spec.DSAPrivateKeySpec> createNewSUT() {
        return java.security.spec.DSAPrivateKeySpec.class;
    }

}
