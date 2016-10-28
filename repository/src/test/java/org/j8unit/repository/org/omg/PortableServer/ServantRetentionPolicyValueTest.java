package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.PortableServer.ServantRetentionPolicyValue;

@RunWith(J8Unit4.class)
public class ServantRetentionPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.ServantRetentionPolicyValueTests<ServantRetentionPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantRetentionPolicyValue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ServantRetentionPolicyValue.NON_RETAIN, //
                                ServantRetentionPolicyValue.RETAIN);
    }

    @Parameter(0)
    public ServantRetentionPolicyValue sut;

    @Override
    public ServantRetentionPolicyValue createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantRetentionPolicyValue]

}
