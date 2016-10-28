package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.ZoneOffset;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ZoneOffsetTest
implements org.j8unit.repository.java.time.ZoneOffsetTests<ZoneOffset> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.ZoneOffset]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ZoneOffset.MIN, //
                                ZoneOffset.UTC, //
                                ZoneOffset.MAX);
    }

    @Parameter(0)
    public ZoneOffset sut;

    @Override
    public ZoneOffset createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.ZoneOffset]

}
