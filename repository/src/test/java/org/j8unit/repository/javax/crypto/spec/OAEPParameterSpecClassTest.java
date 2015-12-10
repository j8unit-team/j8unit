package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OAEPParameterSpecClassTest
implements org.j8unit.repository.javax.crypto.spec.OAEPParameterSpecClassTests<javax.crypto.spec.OAEPParameterSpec> {

    @Override
    public Class<javax.crypto.spec.OAEPParameterSpec> createNewSUT() {
        return javax.crypto.spec.OAEPParameterSpec.class;
    }

}
