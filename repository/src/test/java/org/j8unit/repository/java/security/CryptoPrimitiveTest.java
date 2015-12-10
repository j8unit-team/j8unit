package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CryptoPrimitiveTest
implements org.j8unit.repository.java.security.CryptoPrimitiveTests<java.security.CryptoPrimitive> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.security.CryptoPrimitive.class);
    }

    @Parameter(0)
    public java.security.CryptoPrimitive sut;

    @Override
    public java.security.CryptoPrimitive createNewSUT() {
        return this.sut;
    }

}
