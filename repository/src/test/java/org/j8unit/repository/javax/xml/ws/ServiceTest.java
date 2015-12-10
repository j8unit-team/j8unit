package org.j8unit.repository.javax.xml.ws;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class ServiceTest
implements org.j8unit.repository.javax.xml.ws.ServiceTests<javax.xml.ws.Service> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ModeTest
    implements org.j8unit.repository.javax.xml.ws.ServiceTests.ModeTests<javax.xml.ws.Service.Mode> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(javax.xml.ws.Service.Mode.class);
        }

        @Parameter(0)
        public javax.xml.ws.Service.Mode sut;

        @Override
        public javax.xml.ws.Service.Mode createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public javax.xml.ws.Service createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.xml.ws.Service] available.");
    }

}
