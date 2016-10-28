package org.j8unit.repository.javax.management.modelmbean;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.modelmbean.DescriptorSupport;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DescriptorSupportTest
implements FactoryBasedJ8UnitTest<DescriptorSupport>, org.j8unit.repository.javax.management.modelmbean.DescriptorSupportTests<DescriptorSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.DescriptorSupport]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DescriptorSupport::new);
    }

    @Parameter(0)
    public Callable<DescriptorSupport> sutFactory;

    @Override
    public Callable<DescriptorSupport> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.DescriptorSupport]

}
