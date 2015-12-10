package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IvParameterSpecClassTest
implements org.j8unit.repository.javax.crypto.spec.IvParameterSpecClassTests<javax.crypto.spec.IvParameterSpec> {

    @Override
    public Class<javax.crypto.spec.IvParameterSpec> createNewSUT() {
        return javax.crypto.spec.IvParameterSpec.class;
    }

}
