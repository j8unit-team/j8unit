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
public class FinishingsTest
implements org.j8unit.repository.javax.print.attribute.standard.FinishingsTests<javax.print.attribute.standard.Finishings> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.Finishings.STAPLE_BOTTOM_RIGHT, //
                                javax.print.attribute.standard.Finishings.STAPLE_DUAL_LEFT, //
                                javax.print.attribute.standard.Finishings.EDGE_STITCH, //
                                javax.print.attribute.standard.Finishings.EDGE_STITCH_RIGHT, //
                                javax.print.attribute.standard.Finishings.STAPLE_DUAL_RIGHT, //
                                javax.print.attribute.standard.Finishings.STAPLE_TOP_LEFT, //
                                javax.print.attribute.standard.Finishings.NONE, //
                                javax.print.attribute.standard.Finishings.STAPLE_DUAL_BOTTOM, //
                                javax.print.attribute.standard.Finishings.STAPLE_BOTTOM_LEFT, //
                                javax.print.attribute.standard.Finishings.SADDLE_STITCH, //
                                javax.print.attribute.standard.Finishings.STAPLE_DUAL_TOP, //
                                javax.print.attribute.standard.Finishings.COVER, //
                                javax.print.attribute.standard.Finishings.BIND, //
                                javax.print.attribute.standard.Finishings.EDGE_STITCH_BOTTOM, //
                                javax.print.attribute.standard.Finishings.STAPLE, //
                                javax.print.attribute.standard.Finishings.STAPLE_TOP_RIGHT, //
                                javax.print.attribute.standard.Finishings.EDGE_STITCH_LEFT, //
                                javax.print.attribute.standard.Finishings.EDGE_STITCH_TOP);
    }

    @Parameter(0)
    public javax.print.attribute.standard.Finishings sut;

    @Override
    public javax.print.attribute.standard.Finishings createNewSUT() {
        return this.sut;
    }

}
