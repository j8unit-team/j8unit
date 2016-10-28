package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.PortableServer.RequestProcessingPolicyValue;

@RunWith(J8Unit4.class)
public class RequestProcessingPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.RequestProcessingPolicyValueTests<RequestProcessingPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.RequestProcessingPolicyValue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(RequestProcessingPolicyValue.USE_ACTIVE_OBJECT_MAP_ONLY, //
                                RequestProcessingPolicyValue.USE_SERVANT_MANAGER, //
                                RequestProcessingPolicyValue.USE_DEFAULT_SERVANT);
    }

    @Parameter(0)
    public RequestProcessingPolicyValue sut;

    @Override
    public RequestProcessingPolicyValue createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.RequestProcessingPolicyValue]

}
