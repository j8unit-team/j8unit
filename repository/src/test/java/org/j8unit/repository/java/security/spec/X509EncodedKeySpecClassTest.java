package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509EncodedKeySpecClassTest
implements org.j8unit.repository.java.security.spec.X509EncodedKeySpecClassTests<java.security.spec.X509EncodedKeySpec> {

    @Override
    public Class<java.security.spec.X509EncodedKeySpec> createNewSUT() {
        return java.security.spec.X509EncodedKeySpec.class;
    }

}
