package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.Period;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PeriodTest
implements org.j8unit.repository.java.time.PeriodTests<Period> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Period]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Period.ZERO);
    }

    @Parameter(0)
    public Period sut;

    @Override
    public Period createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Period]

}
