package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PBEKeySpecClassTest
implements org.j8unit.repository.javax.crypto.spec.PBEKeySpecClassTests<javax.crypto.spec.PBEKeySpec> {

    @Override
    public Class<javax.crypto.spec.PBEKeySpec> createNewSUT() {
        return javax.crypto.spec.PBEKeySpec.class;
    }

}
