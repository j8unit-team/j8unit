package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecretKeySpecClassTest
implements org.j8unit.repository.javax.crypto.spec.SecretKeySpecClassTests<javax.crypto.spec.SecretKeySpec> {

    @Override
    public Class<javax.crypto.spec.SecretKeySpec> createNewSUT() {
        return javax.crypto.spec.SecretKeySpec.class;
    }

}
