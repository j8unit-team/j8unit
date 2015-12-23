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
public class ThreadPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.ThreadPolicyValueTests<org.omg.PortableServer.ThreadPolicyValue> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.PortableServer.ThreadPolicyValue.ORB_CTRL_MODEL, //
                                org.omg.PortableServer.ThreadPolicyValue.SINGLE_THREAD_MODEL);
    }

    @Parameter(0)
    public org.omg.PortableServer.ThreadPolicyValue sut;

    @Override
    public org.omg.PortableServer.ThreadPolicyValue createNewSUT() {
        return this.sut;
    }

}
