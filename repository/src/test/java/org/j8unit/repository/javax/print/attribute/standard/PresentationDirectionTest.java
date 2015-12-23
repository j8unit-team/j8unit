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
public class PresentationDirectionTest
implements org.j8unit.repository.javax.print.attribute.standard.PresentationDirectionTests<javax.print.attribute.standard.PresentationDirection> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.PresentationDirection.TOLEFT_TOTOP, //
                                javax.print.attribute.standard.PresentationDirection.TOBOTTOM_TOLEFT, //
                                javax.print.attribute.standard.PresentationDirection.TOTOP_TOLEFT, //
                                javax.print.attribute.standard.PresentationDirection.TORIGHT_TOTOP, //
                                javax.print.attribute.standard.PresentationDirection.TOLEFT_TOBOTTOM, //
                                javax.print.attribute.standard.PresentationDirection.TOBOTTOM_TORIGHT, //
                                javax.print.attribute.standard.PresentationDirection.TOTOP_TORIGHT, //
                                javax.print.attribute.standard.PresentationDirection.TORIGHT_TOBOTTOM);
    }

    @Parameter(0)
    public javax.print.attribute.standard.PresentationDirection sut;

    @Override
    public javax.print.attribute.standard.PresentationDirection createNewSUT() {
        return this.sut;
    }

}
