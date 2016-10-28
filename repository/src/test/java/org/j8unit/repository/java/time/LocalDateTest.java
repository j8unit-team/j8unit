package org.j8unit.repository.java.time;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.LocalDate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class LocalDateTest
implements org.j8unit.repository.java.time.LocalDateTests<LocalDate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.LocalDate]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LocalDate.MAX, //
                                LocalDate.MIN);
    }

    @Parameter(0)
    public LocalDate sut;

    @Override
    public LocalDate createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.LocalDate]

}
