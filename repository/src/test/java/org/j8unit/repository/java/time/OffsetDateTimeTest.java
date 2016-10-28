package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.OffsetDateTime;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class OffsetDateTimeTest
implements org.j8unit.repository.java.time.OffsetDateTimeTests<OffsetDateTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.OffsetDateTime]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(OffsetDateTime.MIN, //
                                OffsetDateTime.MAX);
    }

    @Parameter(0)
    public OffsetDateTime sut;

    @Override
    public OffsetDateTime createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.OffsetDateTime]

}
