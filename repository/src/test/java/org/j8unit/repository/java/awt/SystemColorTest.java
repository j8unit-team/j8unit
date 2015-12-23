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
public class SystemColorTest
implements org.j8unit.repository.java.awt.SystemColorTests<java.awt.SystemColor> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.awt.SystemColor.info, //
                                java.awt.SystemColor.text, //
                                java.awt.SystemColor.controlLtHighlight, //
                                java.awt.SystemColor.controlHighlight, //
                                java.awt.SystemColor.textHighlightText, //
                                java.awt.SystemColor.controlShadow, //
                                java.awt.SystemColor.activeCaptionText, //
                                java.awt.SystemColor.textText, //
                                java.awt.SystemColor.inactiveCaption, //
                                java.awt.SystemColor.desktop, //
                                java.awt.SystemColor.textInactiveText, //
                                java.awt.SystemColor.textHighlight, //
                                java.awt.SystemColor.scrollbar, //
                                java.awt.SystemColor.window, //
                                java.awt.SystemColor.windowBorder, //
                                java.awt.SystemColor.windowText, //
                                java.awt.SystemColor.controlDkShadow, //
                                java.awt.SystemColor.inactiveCaptionBorder, //
                                java.awt.SystemColor.menuText, //
                                java.awt.SystemColor.menu, //
                                java.awt.SystemColor.control, //
                                java.awt.SystemColor.controlText, //
                                java.awt.SystemColor.activeCaption, //
                                java.awt.SystemColor.inactiveCaptionText, //
                                java.awt.SystemColor.activeCaptionBorder, //
                                java.awt.SystemColor.infoText);
    }

    @Parameter(0)
    public java.awt.SystemColor sut;

    @Override
    public java.awt.SystemColor createNewSUT() {
        return this.sut;
    }

}
