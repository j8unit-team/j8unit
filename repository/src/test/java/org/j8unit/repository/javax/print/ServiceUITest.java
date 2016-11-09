package org.j8unit.repository.javax.print;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.print.ServiceUI;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ServiceUITest
implements FactoryBasedJ8UnitTest<ServiceUI>, ServiceUITests<ServiceUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.ServiceUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ServiceUI::new);
    }

    @Parameter(0)
    public Callable<ServiceUI> sutFactory;

    @Override
    public Callable<ServiceUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.ServiceUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.ServiceUI]

}
