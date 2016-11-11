package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer.LifespanPolicyValue;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LifespanPolicyValue} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.LifespanPolicyValueTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LifespanPolicyValueTest
implements LifespanPolicyValueTests<LifespanPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicyValue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LifespanPolicyValue.PERSISTENT, //
                                LifespanPolicyValue.TRANSIENT);
    }

    @Parameter(0)
    public LifespanPolicyValue sut;

    @Override
    public LifespanPolicyValue createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicyValue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicyValue]

}
