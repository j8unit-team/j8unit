package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.security.KeyRep;
import java.security.KeyRep.Type;
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
implements org.j8unit.repository.java.security.KeyRepTests<KeyRep> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyRep]

    @Override
    public KeyRep createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.KeyRep], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyRep]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.java.security.KeyRepTests.TypeTests<Type> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyRep$Type]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Type.class);
        }

        @Parameter(0)
        public Type sut;

        @Override
        public Type createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyRep$Type]

    }

}
