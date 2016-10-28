package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.PortableServer.LifespanPolicyValue;

@RunWith(J8Unit4.class)
public class LifespanPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.LifespanPolicyValueTests<LifespanPolicyValue> {

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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicyValue]

}
