package org.j8unit.repository.java.util.concurrent;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.util.concurrent.TimeUnit;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TimeUnitTest
implements org.j8unit.repository.java.util.concurrent.TimeUnitTests<TimeUnit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.TimeUnit]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(TimeUnit.class);
    }

    @Parameter(0)
    public TimeUnit sut;

    @Override
    public TimeUnit createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.TimeUnit]

}
