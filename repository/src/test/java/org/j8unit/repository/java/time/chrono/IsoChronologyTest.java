package org.j8unit.repository.java.time.chrono;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class IsoChronologyTest
implements org.j8unit.repository.java.time.chrono.IsoChronologyTests<java.time.chrono.IsoChronology> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.time.chrono.IsoChronology.INSTANCE);
    }

    @Parameter(0)
    public java.time.chrono.IsoChronology sut;

    @Override
    public java.time.chrono.IsoChronology createNewSUT() {
        return this.sut;
    }

}
