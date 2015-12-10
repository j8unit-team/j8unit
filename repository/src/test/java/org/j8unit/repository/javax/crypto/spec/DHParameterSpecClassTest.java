package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHParameterSpecClassTest
implements org.j8unit.repository.javax.crypto.spec.DHParameterSpecClassTests<javax.crypto.spec.DHParameterSpec> {

    @Override
    public Class<javax.crypto.spec.DHParameterSpec> createNewSUT() {
        return javax.crypto.spec.DHParameterSpec.class;
    }

}
