package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHGenParameterSpecClassTest
implements org.j8unit.repository.javax.crypto.spec.DHGenParameterSpecClassTests<javax.crypto.spec.DHGenParameterSpec> {

    @Override
    public Class<javax.crypto.spec.DHGenParameterSpec> createNewSUT() {
        return javax.crypto.spec.DHGenParameterSpec.class;
    }

}
