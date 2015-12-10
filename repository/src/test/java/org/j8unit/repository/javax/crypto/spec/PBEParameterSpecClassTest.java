package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PBEParameterSpecClassTest
implements org.j8unit.repository.javax.crypto.spec.PBEParameterSpecClassTests<javax.crypto.spec.PBEParameterSpec> {

    @Override
    public Class<javax.crypto.spec.PBEParameterSpec> createNewSUT() {
        return javax.crypto.spec.PBEParameterSpec.class;
    }

}
