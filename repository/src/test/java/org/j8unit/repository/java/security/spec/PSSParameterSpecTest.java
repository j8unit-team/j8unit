package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PSSParameterSpecTest
implements org.j8unit.repository.java.security.spec.PSSParameterSpecTests<java.security.spec.PSSParameterSpec> {

    @Override
    public java.security.spec.PSSParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.spec.PSSParameterSpec] available.");
    }

}
