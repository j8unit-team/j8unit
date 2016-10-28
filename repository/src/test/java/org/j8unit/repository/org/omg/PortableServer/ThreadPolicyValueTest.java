package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.PortableServer.ThreadPolicyValue;

@RunWith(J8Unit4.class)
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
