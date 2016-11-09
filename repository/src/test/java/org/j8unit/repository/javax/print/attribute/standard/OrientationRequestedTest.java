package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.OrientationRequested;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OrientationRequested} (by simply
 * reusing the J8Unit test interface {@link OrientationRequestedTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class OrientationRequestedTest
implements OrientationRequestedTests<OrientationRequested> {

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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.OrientationRequested]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.OrientationRequested]

}
