package org.j8unit.repository.java.lang.invoke;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.lang.invoke.WrongMethodTypeException;
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
public class WrongMethodTypeExceptionTest
implements FactoryBasedJ8UnitTest<WrongMethodTypeException>, WrongMethodTypeExceptionTests<WrongMethodTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.WrongMethodTypeException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(WrongMethodTypeException::new);
    }

    @Parameter(0)
    public Callable<WrongMethodTypeException> sutFactory;

    @Override
    public Callable<WrongMethodTypeException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.WrongMethodTypeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.WrongMethodTypeException]

}
