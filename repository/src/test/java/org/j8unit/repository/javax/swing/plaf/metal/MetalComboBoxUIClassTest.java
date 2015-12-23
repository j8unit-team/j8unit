package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalComboBoxUIClassTest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUIClassTests<javax.swing.plaf.metal.MetalComboBoxUI> {

    @Override
    public Class<javax.swing.plaf.metal.MetalComboBoxUI> createNewSUT() {
        return javax.swing.plaf.metal.MetalComboBoxUI.class;
    }

    @RunWith(J8Unit4.class)
    public static class MetalComboPopupClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUIClassTests.MetalComboPopupClassTests<javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup> {

        @Override
        public Class<javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup> createNewSUT() {
            return javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class MetalPropertyChangeListenerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUIClassTests.MetalPropertyChangeListenerClassTests<javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener> {

        @Override
        public Class<javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener> createNewSUT() {
            return javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class MetalComboBoxLayoutManagerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUIClassTests.MetalComboBoxLayoutManagerClassTests<javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager> {

        @Override
        public Class<javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager> createNewSUT() {
            return javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager.class;
        }

    }

}
