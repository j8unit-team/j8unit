package org.j8unit.repository.javax.management.modelmbean;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.modelmbean.RequiredModelMBean;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RequiredModelMBeanTest
implements FactoryBasedJ8UnitTest<RequiredModelMBean>, org.j8unit.repository.javax.management.modelmbean.RequiredModelMBeanTests<RequiredModelMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.RequiredModelMBean]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(RequiredModelMBean::new);
    }

    @Parameter(0)
    public Callable<RequiredModelMBean> sutFactory;

    @Override
    public Callable<RequiredModelMBean> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.modelmbean.RequiredModelMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.modelmbean.RequiredModelMBean]

}
