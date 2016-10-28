package org.j8unit.repository.java.lang.reflect;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.lang.reflect.MalformedParametersException;
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
public class MalformedParametersExceptionTest
implements FactoryBasedJ8UnitTest<MalformedParametersException>,
org.j8unit.repository.java.lang.reflect.MalformedParametersExceptionTests<MalformedParametersException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.MalformedParametersException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MalformedParametersException::new);
    }

    @Parameter(0)
    public Callable<MalformedParametersException> sutFactory;

    @Override
    public Callable<MalformedParametersException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.MalformedParametersException]

}
