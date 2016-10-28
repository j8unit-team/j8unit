package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.sql.ClientInfoStatus;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ClientInfoStatusTest
implements org.j8unit.repository.java.sql.ClientInfoStatusTests<ClientInfoStatus> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.ClientInfoStatus]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(ClientInfoStatus.class);
    }

    @Parameter(0)
    public ClientInfoStatus sut;

    @Override
    public ClientInfoStatus createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.ClientInfoStatus]

}
