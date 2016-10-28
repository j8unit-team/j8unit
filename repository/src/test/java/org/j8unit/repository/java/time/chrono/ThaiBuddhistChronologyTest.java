package org.j8unit.repository.java.time.chrono;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.chrono.ThaiBuddhistChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.ThaiBuddhistChronology]

}
