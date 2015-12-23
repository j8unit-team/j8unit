package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StateTest
implements org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.StateTests<org.omg.PortableServer.POAManagerPackage.State> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.PortableServer.POAManagerPackage.State.ACTIVE, //
                                org.omg.PortableServer.POAManagerPackage.State.INACTIVE, //
                                org.omg.PortableServer.POAManagerPackage.State.DISCARDING, //
                                org.omg.PortableServer.POAManagerPackage.State.HOLDING);
    }

    @Parameter(0)
    public org.omg.PortableServer.POAManagerPackage.State sut;

    @Override
    public org.omg.PortableServer.POAManagerPackage.State createNewSUT() {
        return this.sut;
    }

}
