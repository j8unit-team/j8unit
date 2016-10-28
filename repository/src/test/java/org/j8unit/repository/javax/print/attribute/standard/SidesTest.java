package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.Sides;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class SidesTest
implements org.j8unit.repository.javax.print.attribute.standard.SidesTests<Sides> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.Sides]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Sides.TWO_SIDED_SHORT_EDGE, //
                                Sides.TUMBLE, //
                                Sides.ONE_SIDED, //
                                Sides.DUPLEX, //
                                Sides.TWO_SIDED_LONG_EDGE);
    }

    @Parameter(0)
    public Sides sut;

    @Override
    public Sides createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.Sides]

}
