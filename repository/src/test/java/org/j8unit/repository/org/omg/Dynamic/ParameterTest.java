package org.j8unit.repository.org.omg.Dynamic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.Dynamic.Parameter;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ParameterTest
implements FactoryBasedJ8UnitTest<Parameter>, org.j8unit.repository.org.omg.Dynamic.ParameterTests<Parameter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.Dynamic.Parameter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Parameter::new);
    }

    @org.junit.runners.Parameterized.Parameter(0)
    public Callable<Parameter> sutFactory;

    @Override
    public Callable<Parameter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.Dynamic.Parameter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.Dynamic.Parameter]

}
