package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.security.CryptoPrimitive;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class CryptoPrimitiveTest
implements org.j8unit.repository.java.security.CryptoPrimitiveTests<CryptoPrimitive> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.CryptoPrimitive]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(CryptoPrimitive.class);
    }

    @Parameter(0)
    public CryptoPrimitive sut;

    @Override
    public CryptoPrimitive createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.CryptoPrimitive]

}
