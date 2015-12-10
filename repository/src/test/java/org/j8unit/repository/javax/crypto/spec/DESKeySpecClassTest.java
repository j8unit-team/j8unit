package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DESKeySpecClassTest
implements org.j8unit.repository.javax.crypto.spec.DESKeySpecClassTests<javax.crypto.spec.DESKeySpec> {

    @Override
    public Class<javax.crypto.spec.DESKeySpec> createNewSUT() {
        return javax.crypto.spec.DESKeySpec.class;
    }

}
