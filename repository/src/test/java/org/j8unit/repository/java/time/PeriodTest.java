package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.Period;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
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
