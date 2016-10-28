package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.Finishings;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class FinishingsTest
implements org.j8unit.repository.javax.print.attribute.standard.FinishingsTests<Finishings> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.Finishings]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Finishings.STAPLE_BOTTOM_RIGHT, //
                                Finishings.STAPLE_DUAL_LEFT, //
                                Finishings.EDGE_STITCH, //
                                Finishings.EDGE_STITCH_RIGHT, //
                                Finishings.STAPLE_DUAL_RIGHT, //
                                Finishings.STAPLE_TOP_LEFT, //
                                Finishings.NONE, //
                                Finishings.STAPLE_DUAL_BOTTOM, //
                                Finishings.STAPLE_BOTTOM_LEFT, //
                                Finishings.SADDLE_STITCH, //
                                Finishings.STAPLE_DUAL_TOP, //
                                Finishings.COVER, //
                                Finishings.BIND, //
                                Finishings.EDGE_STITCH_BOTTOM, //
                                Finishings.STAPLE, //
                                Finishings.STAPLE_TOP_RIGHT, //
                                Finishings.EDGE_STITCH_LEFT, //
                                Finishings.EDGE_STITCH_TOP);
    }

    @Parameter(0)
    public Finishings sut;

    @Override
    public Finishings createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.Finishings]

}
