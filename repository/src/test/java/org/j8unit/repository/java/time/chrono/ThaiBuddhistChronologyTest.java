package org.j8unit.repository.java.time.chrono;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.chrono.ThaiBuddhistChronology;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ThaiBuddhistChronologyTest
implements org.j8unit.repository.java.time.chrono.ThaiBuddhistChronologyTests<ThaiBuddhistChronology> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.ThaiBuddhistChronology]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ThaiBuddhistChronology.INSTANCE);
    }

    @Parameter(0)
    public ThaiBuddhistChronology sut;

    @Override
    public ThaiBuddhistChronology createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.ThaiBuddhistChronology]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.ThaiBuddhistChronology]

}
