package org.j8unit.repository.javax.xml.ws;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.xml.ws.Service;
import javax.xml.ws.Service.Mode;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class ServiceTest
implements org.j8unit.repository.javax.xml.ws.ServiceTests<Service> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Service]

    @Override
    public Service createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.ws.Service], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.Service]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.Service]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ModeTest
    implements org.j8unit.repository.javax.xml.ws.ServiceTests.ModeTests<Mode> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Service$Mode]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Mode.class);
        }

        @Parameter(0)
        public Mode sut;

        @Override
        public Mode createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.Service$Mode]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.Service$Mode]

    }

}
