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
public class RequestProcessingPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.RequestProcessingPolicyValueTests<org.omg.PortableServer.RequestProcessingPolicyValue> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.PortableServer.RequestProcessingPolicyValue.USE_ACTIVE_OBJECT_MAP_ONLY, //
                                org.omg.PortableServer.RequestProcessingPolicyValue.USE_SERVANT_MANAGER, //
                                org.omg.PortableServer.RequestProcessingPolicyValue.USE_DEFAULT_SERVANT);
    }

    @Parameter(0)
    public org.omg.PortableServer.RequestProcessingPolicyValue sut;

    @Override
    public org.omg.PortableServer.RequestProcessingPolicyValue createNewSUT() {
        return this.sut;
    }

}
