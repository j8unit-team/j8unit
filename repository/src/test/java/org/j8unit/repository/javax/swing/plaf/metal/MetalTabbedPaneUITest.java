package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalTabbedPaneUITest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUITests<javax.swing.plaf.metal.MetalTabbedPaneUI> {

    @Override
    public javax.swing.plaf.metal.MetalTabbedPaneUI createNewSUT() {
        return new javax.swing.plaf.metal.MetalTabbedPaneUI();
    }

    @RunWith(J8Unit4.class)
    public static class TabbedPaneLayoutTest
    implements
    org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUITests.TabbedPaneLayoutTests<javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout> {

        @Override
        public javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout] available.");
        }

    }

}
