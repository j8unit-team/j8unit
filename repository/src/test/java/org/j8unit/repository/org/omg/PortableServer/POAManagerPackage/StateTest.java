package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer.POAManagerPackage.State;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link State} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.StateTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StateTest
implements StateTests<State> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAManagerPackage.State]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.POAManagerPackage.State]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.POAManagerPackage.State]

}
