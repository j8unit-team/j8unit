package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GCMParameterSpecClassTest
implements org.j8unit.repository.javax.crypto.spec.GCMParameterSpecClassTests<javax.crypto.spec.GCMParameterSpec> {

    @Override
    public Class<javax.crypto.spec.GCMParameterSpec> createNewSUT() {
        return javax.crypto.spec.GCMParameterSpec.class;
    }

}
