package org.j8unit.repository.java.time.temporal;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.temporal.ChronoUnit;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ChronoUnitTest
implements org.j8unit.repository.java.time.temporal.ChronoUnitTests<ChronoUnit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.ChronoUnit]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(ChronoUnit.class);
    }

    @Parameter(0)
    public ChronoUnit sut;

    @Override
    public ChronoUnit createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.ChronoUnit]

}
