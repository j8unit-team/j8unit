package org.j8unit.repository.java.sql;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.sql.PseudoColumnUsage;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class PseudoColumnUsageTest
implements org.j8unit.repository.java.sql.PseudoColumnUsageTests<PseudoColumnUsage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.PseudoColumnUsage]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(PseudoColumnUsage.class);
    }

    @Parameter(0)
    public PseudoColumnUsage sut;

    @Override
    public PseudoColumnUsage createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.PseudoColumnUsage]

}
