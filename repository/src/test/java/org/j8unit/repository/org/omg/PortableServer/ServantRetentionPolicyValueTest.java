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
public class ServantRetentionPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.ServantRetentionPolicyValueTests<org.omg.PortableServer.ServantRetentionPolicyValue> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.PortableServer.ServantRetentionPolicyValue.NON_RETAIN, //
                                org.omg.PortableServer.ServantRetentionPolicyValue.RETAIN);
    }

    @Parameter(0)
    public org.omg.PortableServer.ServantRetentionPolicyValue sut;

    @Override
    public org.omg.PortableServer.ServantRetentionPolicyValue createNewSUT() {
        return this.sut;
    }

}
