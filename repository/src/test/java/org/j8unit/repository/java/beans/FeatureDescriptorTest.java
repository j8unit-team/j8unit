package org.j8unit.repository.java.beans;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.beans.FeatureDescriptor;
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
public class FeatureDescriptorTest
implements FactoryBasedJ8UnitTest<FeatureDescriptor>, org.j8unit.repository.java.beans.FeatureDescriptorTests<FeatureDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.FeatureDescriptor]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(FeatureDescriptor::new);
    }

    @Parameter(0)
    public Callable<FeatureDescriptor> sutFactory;

    @Override
    public Callable<FeatureDescriptor> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.FeatureDescriptor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.FeatureDescriptor]

}
