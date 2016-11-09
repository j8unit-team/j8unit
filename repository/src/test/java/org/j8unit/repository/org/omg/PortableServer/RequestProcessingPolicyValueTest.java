package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer.RequestProcessingPolicyValue;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RequestProcessingPolicyValue} (by
 * simply reusing the J8Unit test interface {@link RequestProcessingPolicyValueTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RequestProcessingPolicyValueTest
implements RequestProcessingPolicyValueTests<RequestProcessingPolicyValue> {

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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.RequestProcessingPolicyValue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.RequestProcessingPolicyValue]

}
