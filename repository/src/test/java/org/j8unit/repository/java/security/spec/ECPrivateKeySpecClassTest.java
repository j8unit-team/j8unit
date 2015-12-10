package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPrivateKeySpecClassTest
implements org.j8unit.repository.java.security.spec.ECPrivateKeySpecClassTests<java.security.spec.ECPrivateKeySpec> {

    @Override
    public Class<java.security.spec.ECPrivateKeySpec> createNewSUT() {
        return java.security.spec.ECPrivateKeySpec.class;
    }

}
