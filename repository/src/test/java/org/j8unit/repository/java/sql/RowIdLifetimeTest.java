package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.sql.RowIdLifetime;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
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
