package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalTabbedPaneUIClassTest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUIClassTests<javax.swing.plaf.metal.MetalTabbedPaneUI> {

    @RunWith(J8Unit4.class)
    public static class TabbedPaneLayoutClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUIClassTests.TabbedPaneLayoutClassTests<javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout> {

        @Override
        public Class<javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout> createNewSUT() {
            return javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout.class;
        }

    }

    @Override
    public Class<javax.swing.plaf.metal.MetalTabbedPaneUI> createNewSUT() {
        return javax.swing.plaf.metal.MetalTabbedPaneUI.class;
    }

}
