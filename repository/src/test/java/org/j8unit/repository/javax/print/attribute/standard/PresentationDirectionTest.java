package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.PresentationDirection;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PresentationDirection} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.attribute.standard.PresentationDirectionTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PresentationDirectionTest
implements PresentationDirectionTests<PresentationDirection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PresentationDirection]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(PresentationDirection.TOLEFT_TOTOP, //
                                PresentationDirection.TOBOTTOM_TOLEFT, //
                                PresentationDirection.TOTOP_TOLEFT, //
                                PresentationDirection.TORIGHT_TOTOP, //
                                PresentationDirection.TOLEFT_TOBOTTOM, //
                                PresentationDirection.TOBOTTOM_TORIGHT, //
                                PresentationDirection.TOTOP_TORIGHT, //
                                PresentationDirection.TORIGHT_TOBOTTOM);
    }

    @Parameter(0)
    public PresentationDirection sut;

    @Override
    public PresentationDirection createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.PresentationDirection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.PresentationDirection]

}
