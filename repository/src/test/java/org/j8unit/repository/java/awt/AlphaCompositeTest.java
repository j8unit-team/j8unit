package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AlphaCompositeTest
implements org.j8unit.repository.java.awt.AlphaCompositeTests<java.awt.AlphaComposite> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.awt.AlphaComposite.Dst, //
                                java.awt.AlphaComposite.DstOver, //
                                java.awt.AlphaComposite.Src, //
                                java.awt.AlphaComposite.Xor, //
                                java.awt.AlphaComposite.SrcAtop, //
                                java.awt.AlphaComposite.SrcOver, //
                                java.awt.AlphaComposite.DstIn, //
                                java.awt.AlphaComposite.DstAtop, //
                                java.awt.AlphaComposite.Clear, //
                                java.awt.AlphaComposite.SrcIn, //
                                java.awt.AlphaComposite.SrcOut, //
                                java.awt.AlphaComposite.DstOut);
    }

    @Parameter(0)
    public java.awt.AlphaComposite sut;

    @Override
    public java.awt.AlphaComposite createNewSUT() {
        return this.sut;
    }

}
