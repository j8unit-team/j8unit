package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.SystemColor;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SystemColor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.SystemColorTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SystemColorTest
implements SystemColorTests<SystemColor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.SystemColor]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SystemColor.info, //
                                SystemColor.text, //
                                SystemColor.controlLtHighlight, //
                                SystemColor.controlHighlight, //
                                SystemColor.textHighlightText, //
                                SystemColor.controlShadow, //
                                SystemColor.activeCaptionText, //
                                SystemColor.textText, //
                                SystemColor.inactiveCaption, //
                                SystemColor.desktop, //
                                SystemColor.textInactiveText, //
                                SystemColor.textHighlight, //
                                SystemColor.scrollbar, //
                                SystemColor.window, //
                                SystemColor.windowBorder, //
                                SystemColor.windowText, //
                                SystemColor.controlDkShadow, //
                                SystemColor.inactiveCaptionBorder, //
                                SystemColor.menuText, //
                                SystemColor.menu, //
                                SystemColor.control, //
                                SystemColor.controlText, //
                                SystemColor.activeCaption, //
                                SystemColor.inactiveCaptionText, //
                                SystemColor.activeCaptionBorder, //
                                SystemColor.infoText);
    }

    @Parameter(0)
    public SystemColor sut;

    @Override
    public SystemColor createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.SystemColor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.SystemColor]

}
