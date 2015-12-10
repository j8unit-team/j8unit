package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeySpecTest
implements org.j8unit.repository.javax.crypto.spec.SecretKeySpecTests<javax.crypto.spec.SecretKeySpec> {

    @Override
    public javax.crypto.spec.SecretKeySpec createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.crypto.spec.SecretKeySpec] available.");
    }

}
