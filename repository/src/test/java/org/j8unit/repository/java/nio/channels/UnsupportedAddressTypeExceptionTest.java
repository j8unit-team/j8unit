package org.j8unit.repository.java.nio.channels;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.channels.UnsupportedAddressTypeException;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class UnsupportedAddressTypeExceptionTest
implements FactoryBasedJ8UnitTest<UnsupportedAddressTypeException>, UnsupportedAddressTypeExceptionTests<UnsupportedAddressTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.UnsupportedAddressTypeException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(UnsupportedAddressTypeException::new);
    }

    @Parameter(0)
    public Callable<UnsupportedAddressTypeException> sutFactory;

    @Override
    public Callable<UnsupportedAddressTypeException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.UnsupportedAddressTypeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.UnsupportedAddressTypeException]

}
