package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LocalTimeTest
implements org.j8unit.repository.java.time.LocalTimeTests<java.time.LocalTime> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.time.LocalTime.MIDNIGHT, //
                                java.time.LocalTime.MIN, //
                                java.time.LocalTime.NOON, //
                                java.time.LocalTime.MAX);
    }

    @Parameter(0)
    public java.time.LocalTime sut;

    @Override
    public java.time.LocalTime createNewSUT() {
        return this.sut;
    }

}
