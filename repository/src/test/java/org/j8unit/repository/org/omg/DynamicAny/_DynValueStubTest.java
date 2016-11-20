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
import org.omg.DynamicAny._DynValueStub;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _DynValueStubTest
implements FactoryBasedJ8UnitTest<_DynValueStub>, _DynValueStubTests<_DynValueStub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny._DynValueStub]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(_DynValueStub::new);
    }

    @Parameter(0)
    public Callable<_DynValueStub> sutFactory;

    @Override
    public Callable<_DynValueStub> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny._DynValueStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny._DynValueStub]

}
