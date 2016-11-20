package org.j8unit.repository.java.security;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.security.CryptoPrimitive;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CryptoPrimitive} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.CryptoPrimitiveTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CryptoPrimitiveTest
implements CryptoPrimitiveTests<CryptoPrimitive> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.CryptoPrimitive]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(CryptoPrimitive.class);
    }

    @Parameter(0)
    public CryptoPrimitive sut;

    @Override
    public CryptoPrimitive createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.CryptoPrimitive]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.CryptoPrimitive]

}
