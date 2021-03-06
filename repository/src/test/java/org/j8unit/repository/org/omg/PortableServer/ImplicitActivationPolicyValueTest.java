package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.PortableServer.ImplicitActivationPolicyValue;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImplicitActivationPolicyValue} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.ImplicitActivationPolicyValueTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ImplicitActivationPolicyValueTest
implements ImplicitActivationPolicyValueTests<ImplicitActivationPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ImplicitActivationPolicyValue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ImplicitActivationPolicyValue.IMPLICIT_ACTIVATION, //
                                ImplicitActivationPolicyValue.NO_IMPLICIT_ACTIVATION);
    }

    @Parameter(0)
    public ImplicitActivationPolicyValue sut;

    @Override
    public ImplicitActivationPolicyValue createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.ImplicitActivationPolicyValue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.ImplicitActivationPolicyValue]

}
