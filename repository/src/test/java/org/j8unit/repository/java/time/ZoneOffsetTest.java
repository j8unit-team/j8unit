package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.ZoneOffset;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ZoneOffset} (by simply reusing the
 * J8Unit test interface {@link ZoneOffsetTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ZoneOffsetTest
implements ZoneOffsetTests<ZoneOffset> {

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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.ZoneOffset]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.ZoneOffset]

}
