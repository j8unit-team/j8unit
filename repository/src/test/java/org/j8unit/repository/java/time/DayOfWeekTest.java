package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DayOfWeekTest
implements org.j8unit.repository.java.time.DayOfWeekTests<java.time.DayOfWeek> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.time.DayOfWeek.class);
    }

    @Parameter(0)
    public java.time.DayOfWeek sut;

    @Override
    public java.time.DayOfWeek createNewSUT() {
        return this.sut;
    }

}
