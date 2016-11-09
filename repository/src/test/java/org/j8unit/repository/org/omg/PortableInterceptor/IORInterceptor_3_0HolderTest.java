package org.j8unit.repository.org.omg.PortableInterceptor;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableInterceptor.IORInterceptor_3_0Holder;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class IORInterceptor_3_0HolderTest
implements FactoryBasedJ8UnitTest<IORInterceptor_3_0Holder>, IORInterceptor_3_0HolderTests<IORInterceptor_3_0Holder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.IORInterceptor_3_0Holder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(IORInterceptor_3_0Holder::new);
    }

    @Parameter(0)
    public Callable<IORInterceptor_3_0Holder> sutFactory;

    @Override
    public Callable<IORInterceptor_3_0Holder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.IORInterceptor_3_0Holder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.IORInterceptor_3_0Holder]

}
