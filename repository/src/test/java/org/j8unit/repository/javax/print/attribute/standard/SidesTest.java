package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SidesTest
implements org.j8unit.repository.javax.print.attribute.standard.SidesTests<javax.print.attribute.standard.Sides> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.Sides.TWO_SIDED_SHORT_EDGE, //
                                javax.print.attribute.standard.Sides.TUMBLE, //
                                javax.print.attribute.standard.Sides.ONE_SIDED, //
                                javax.print.attribute.standard.Sides.DUPLEX, //
                                javax.print.attribute.standard.Sides.TWO_SIDED_LONG_EDGE);
    }

    @Parameter(0)
    public javax.print.attribute.standard.Sides sut;

    @Override
    public javax.print.attribute.standard.Sides createNewSUT() {
        return this.sut;
    }

}
