package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PSSParameterSpecClassTest
implements org.j8unit.repository.java.security.spec.PSSParameterSpecClassTests<java.security.spec.PSSParameterSpec> {

    @Override
    public Class<java.security.spec.PSSParameterSpec> createNewSUT() {
        return java.security.spec.PSSParameterSpec.class;
    }

}
