package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class KeyRepTest
implements org.j8unit.repository.java.security.KeyRepTests<java.security.KeyRep> {

    @Override
    public java.security.KeyRep createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.KeyRep] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.java.security.KeyRepTests.TypeTests<java.security.KeyRep.Type> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.security.KeyRep.Type.class);
        }

        @Parameter(0)
        public java.security.KeyRep.Type sut;

        @Override
        public java.security.KeyRep.Type createNewSUT() {
            return this.sut;
        }

    }

}
