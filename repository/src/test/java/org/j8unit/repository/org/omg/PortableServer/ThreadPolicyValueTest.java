package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer.ThreadPolicyValue;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ThreadPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.ThreadPolicyValueTests<ThreadPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ThreadPolicyValue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ThreadPolicyValue.ORB_CTRL_MODEL, //
                                ThreadPolicyValue.SINGLE_THREAD_MODEL);
    }

    @Parameter(0)
    public ThreadPolicyValue sut;

    @Override
    public ThreadPolicyValue createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ThreadPolicyValue]

}
