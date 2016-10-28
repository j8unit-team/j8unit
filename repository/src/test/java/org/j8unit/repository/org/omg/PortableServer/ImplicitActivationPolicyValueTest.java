package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.PortableServer.ImplicitActivationPolicyValue;

@RunWith(J8Unit4.class)
public class ImplicitActivationPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.ImplicitActivationPolicyValueTests<ImplicitActivationPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ImplicitActivationPolicyValue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ImplicitActivationPolicyValue.IMPLICIT_ACTIVATION, //
                                ImplicitActivationPolicyValue.NO_IMPLICIT_ACTIVATION);
    }

    @Parameter(0)
    public ImplicitActivationPolicyValue sut;

    @Override
    public ImplicitActivationPolicyValue createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ImplicitActivationPolicyValue]

}
