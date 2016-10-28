package org.j8unit.repository.javax.xml.ws.soap;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.util.concurrent.Callable;
import javax.xml.ws.soap.AddressingFeature;
import javax.xml.ws.soap.AddressingFeature.Responses;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AddressingFeatureTest
implements FactoryBasedJ8UnitTest<AddressingFeature>, org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests<AddressingFeature> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AddressingFeature::new);
    }

    @Parameter(0)
    public Callable<AddressingFeature> sutFactory;

    @Override
    public Callable<AddressingFeature> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature]

    @RunWith(J8Unit4.class)
    public static class ResponsesTest
    implements org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureTests.ResponsesTests<Responses> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature$Responses]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Responses.class);
        }

        @Parameter(0)
        public Responses sut;

        @Override
        public Responses createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.AddressingFeature$Responses]

    }

}
