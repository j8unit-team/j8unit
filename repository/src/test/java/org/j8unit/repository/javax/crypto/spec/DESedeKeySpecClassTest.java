package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DESedeKeySpecClassTest
implements org.j8unit.repository.javax.crypto.spec.DESedeKeySpecClassTests<javax.crypto.spec.DESedeKeySpec> {

    @Override
    public Class<javax.crypto.spec.DESedeKeySpec> createNewSUT() {
        return javax.crypto.spec.DESedeKeySpec.class;
    }

}
