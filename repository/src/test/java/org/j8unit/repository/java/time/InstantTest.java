package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.Instant;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class InstantTest
implements org.j8unit.repository.java.time.InstantTests<Instant> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Instant]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Instant.EPOCH, //
                                Instant.MAX, //
                                Instant.MIN);
    }

    @Parameter(0)
    public Instant sut;

    @Override
    public Instant createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Instant]

}
