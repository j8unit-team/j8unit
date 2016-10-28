package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.OrientationRequested;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class OrientationRequestedTest
implements org.j8unit.repository.javax.print.attribute.standard.OrientationRequestedTests<OrientationRequested> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.OrientationRequested]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(OrientationRequested.REVERSE_PORTRAIT, //
                                OrientationRequested.REVERSE_LANDSCAPE, //
                                OrientationRequested.LANDSCAPE, //
                                OrientationRequested.PORTRAIT);
    }

    @Parameter(0)
    public OrientationRequested sut;

    @Override
    public OrientationRequested createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.OrientationRequested]

}
