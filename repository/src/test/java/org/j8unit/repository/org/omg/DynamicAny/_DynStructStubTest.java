package org.j8unit.repository.org.omg.DynamicAny;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.DynamicAny._DynStructStub;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _DynStructStubTest
implements FactoryBasedJ8UnitTest<_DynStructStub>, _DynStructStubTests<_DynStructStub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny._DynStructStub]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(_DynStructStub::new);
    }

    @Parameter(0)
    public Callable<_DynStructStub> sutFactory;

    @Override
    public Callable<_DynStructStub> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny._DynStructStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny._DynStructStub]

}
