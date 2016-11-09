package org.j8unit.repository.javax.xml.ws.wsaddressing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class W3CEndpointReferenceBuilderTest
implements FactoryBasedJ8UnitTest<W3CEndpointReferenceBuilder>, W3CEndpointReferenceBuilderTests<W3CEndpointReferenceBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(W3CEndpointReferenceBuilder::new);
    }

    @Parameter(0)
    public Callable<W3CEndpointReferenceBuilder> sutFactory;

    @Override
    public Callable<W3CEndpointReferenceBuilder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder]

}
