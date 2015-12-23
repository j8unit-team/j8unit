package org.j8unit.repository.java.time.temporal;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class WeekFieldsTest
implements org.j8unit.repository.java.time.temporal.WeekFieldsTests<java.time.temporal.WeekFields> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.time.temporal.WeekFields.SUNDAY_START, //
                                java.time.temporal.WeekFields.ISO);
    }

    @Parameter(0)
    public java.time.temporal.WeekFields sut;

    @Override
    public java.time.temporal.WeekFields createNewSUT() {
        return this.sut;
    }

}
