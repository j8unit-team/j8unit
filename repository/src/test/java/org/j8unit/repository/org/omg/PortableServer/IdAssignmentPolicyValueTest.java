package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.PortableServer.IdAssignmentPolicyValue;

@RunWith(J8Unit4.class)
public class IdAssignmentPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyValueTests<IdAssignmentPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.IdAssignmentPolicyValue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(IdAssignmentPolicyValue.SYSTEM_ID, //
                                IdAssignmentPolicyValue.USER_ID);
    }

    @Parameter(0)
    public IdAssignmentPolicyValue sut;

    @Override
    public IdAssignmentPolicyValue createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.IdAssignmentPolicyValue]

}
