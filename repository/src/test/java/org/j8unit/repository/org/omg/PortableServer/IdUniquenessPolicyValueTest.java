package org.j8unit.repository.org.omg.PortableServer;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.PortableServer.IdUniquenessPolicyValue;

@RunWith(J8Unit4.class)
public class IdUniquenessPolicyValueTest
implements org.j8unit.repository.org.omg.PortableServer.IdUniquenessPolicyValueTests<IdUniquenessPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.IdUniquenessPolicyValue]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(IdUniquenessPolicyValue.MULTIPLE_ID, //
                                IdUniquenessPolicyValue.UNIQUE_ID);
    }

    @Parameter(0)
    public IdUniquenessPolicyValue sut;

    @Override
    public IdUniquenessPolicyValue createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.IdUniquenessPolicyValue]

}
