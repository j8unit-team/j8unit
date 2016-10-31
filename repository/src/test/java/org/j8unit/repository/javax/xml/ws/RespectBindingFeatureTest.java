package org.j8unit.repository.javax.xml.ws;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.ws.RespectBindingFeature;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RespectBindingFeatureTest
implements FactoryBasedJ8UnitTest<RespectBindingFeature>, org.j8unit.repository.javax.xml.ws.RespectBindingFeatureTests<RespectBindingFeature> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.RespectBindingFeature]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(RespectBindingFeature::new);
    }

    @Parameter(0)
    public Callable<RespectBindingFeature> sutFactory;

    @Override
    public Callable<RespectBindingFeature> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.RespectBindingFeature]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.RespectBindingFeature]

}
