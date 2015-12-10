package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHPublicKeySpecClassTest
implements org.j8unit.repository.javax.crypto.spec.DHPublicKeySpecClassTests<javax.crypto.spec.DHPublicKeySpec> {

    @Override
    public Class<javax.crypto.spec.DHPublicKeySpec> createNewSUT() {
        return javax.crypto.spec.DHPublicKeySpec.class;
    }

}
