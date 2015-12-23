package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class IdUniquenessPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.IdUniquenessPolicyValueTests<org.omg.PortableServer.IdUniquenessPolicyValue> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.PortableServer.IdUniquenessPolicyValue.MULTIPLE_ID, //
                                org.omg.PortableServer.IdUniquenessPolicyValue.UNIQUE_ID);
    }

    @Parameter(0)
    public org.omg.PortableServer.IdUniquenessPolicyValue sut;

    @Override
    public org.omg.PortableServer.IdUniquenessPolicyValue createNewSUT() {
        return this.sut;
    }

}
