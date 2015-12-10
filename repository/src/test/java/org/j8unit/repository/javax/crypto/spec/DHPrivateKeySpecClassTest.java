package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHPrivateKeySpecClassTest
implements org.j8unit.repository.javax.crypto.spec.DHPrivateKeySpecClassTests<javax.crypto.spec.DHPrivateKeySpec> {

    @Override
    public Class<javax.crypto.spec.DHPrivateKeySpec> createNewSUT() {
        return javax.crypto.spec.DHPrivateKeySpec.class;
    }

}
