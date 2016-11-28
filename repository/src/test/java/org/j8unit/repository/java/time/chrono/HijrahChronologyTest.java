package org.j8unit.repository.java.time.chrono;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.chrono.HijrahChronology;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HijrahChronology} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.time.chrono.HijrahChronologyTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class HijrahChronologyTest
implements HijrahChronologyTests<HijrahChronology> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.HijrahChronology]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(HijrahChronology.INSTANCE);
    }

    @Parameter(0)
    public HijrahChronology sut;

    @Override
    public HijrahChronology createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.HijrahChronology]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.HijrahChronology]

}
