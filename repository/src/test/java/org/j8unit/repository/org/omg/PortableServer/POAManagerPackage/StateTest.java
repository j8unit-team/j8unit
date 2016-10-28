package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.PortableServer.POAManagerPackage.State;

@RunWith(J8Unit4.class)
public class StateTest
implements org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.StateTests<State> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAManagerPackage.State]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(State.ACTIVE, //
                                State.INACTIVE, //
                                State.DISCARDING, //
                                State.HOLDING);
    }

    @Parameter(0)
    public State sut;

    @Override
    public State createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAManagerPackage.State]

}
