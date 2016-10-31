package org.j8unit.repository.javax.xml.ws.soap;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.ws.soap.MTOMFeature;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MTOMFeatureTest
implements FactoryBasedJ8UnitTest<MTOMFeature>, org.j8unit.repository.javax.xml.ws.soap.MTOMFeatureTests<MTOMFeature> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.MTOMFeature]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MTOMFeature::new);
    }

    @Parameter(0)
    public Callable<MTOMFeature> sutFactory;

    @Override
    public Callable<MTOMFeature> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.soap.MTOMFeature]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.soap.MTOMFeature]

}
