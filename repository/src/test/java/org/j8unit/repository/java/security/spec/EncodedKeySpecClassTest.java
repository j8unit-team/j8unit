package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EncodedKeySpecClassTest
implements org.j8unit.repository.java.security.spec.EncodedKeySpecClassTests<java.security.spec.EncodedKeySpec> {

    @Override
    public Class<java.security.spec.EncodedKeySpec> createNewSUT() {
        return java.security.spec.EncodedKeySpec.class;
    }

}
