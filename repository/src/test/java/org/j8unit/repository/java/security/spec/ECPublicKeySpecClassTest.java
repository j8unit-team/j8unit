package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPublicKeySpecClassTest
implements org.j8unit.repository.java.security.spec.ECPublicKeySpecClassTests<java.security.spec.ECPublicKeySpec> {

    @Override
    public Class<java.security.spec.ECPublicKeySpec> createNewSUT() {
        return java.security.spec.ECPublicKeySpec.class;
    }

}
