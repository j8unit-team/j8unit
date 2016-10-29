package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.sql.RowIdLifetime;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RowIdLifetimeTest
implements org.j8unit.repository.java.sql.RowIdLifetimeTests<RowIdLifetime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.RowIdLifetime]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(RowIdLifetime.class);
    }

    @Parameter(0)
    public RowIdLifetime sut;

    @Override
    public RowIdLifetime createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.RowIdLifetime]

}
