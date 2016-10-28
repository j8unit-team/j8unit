package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.AlphaComposite;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class AlphaCompositeTest
implements org.j8unit.repository.java.awt.AlphaCompositeTests<AlphaComposite> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.AlphaComposite]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AlphaComposite.Dst, //
                                AlphaComposite.DstOver, //
                                AlphaComposite.Src, //
                                AlphaComposite.Xor, //
                                AlphaComposite.SrcAtop, //
                                AlphaComposite.SrcOver, //
                                AlphaComposite.DstIn, //
                                AlphaComposite.DstAtop, //
                                AlphaComposite.Clear, //
                                AlphaComposite.SrcIn, //
                                AlphaComposite.SrcOut, //
                                AlphaComposite.DstOut);
    }

    @Parameter(0)
    public AlphaComposite sut;

    @Override
    public AlphaComposite createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.AlphaComposite]

}
