package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ClientInfoStatusTest
implements org.j8unit.repository.java.sql.ClientInfoStatusTests<java.sql.ClientInfoStatus> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.sql.ClientInfoStatus.class);
    }

    @Parameter(0)
    public java.sql.ClientInfoStatus sut;

    @Override
    public java.sql.ClientInfoStatus createNewSUT() {
        return this.sut;
    }

}
