package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RC5ParameterSpecClassTest
implements org.j8unit.repository.javax.crypto.spec.RC5ParameterSpecClassTests<javax.crypto.spec.RC5ParameterSpec> {

    @Override
    public Class<javax.crypto.spec.RC5ParameterSpec> createNewSUT() {
        return javax.crypto.spec.RC5ParameterSpec.class;
    }

}
