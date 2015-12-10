package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKCS8EncodedKeySpecClassTest
implements org.j8unit.repository.java.security.spec.PKCS8EncodedKeySpecClassTests<java.security.spec.PKCS8EncodedKeySpec> {

    @Override
    public Class<java.security.spec.PKCS8EncodedKeySpec> createNewSUT() {
        return java.security.spec.PKCS8EncodedKeySpec.class;
    }

}
