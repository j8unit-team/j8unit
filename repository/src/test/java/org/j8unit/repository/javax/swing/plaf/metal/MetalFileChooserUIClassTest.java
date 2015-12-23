package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalFileChooserUIClassTest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUIClassTests<javax.swing.plaf.metal.MetalFileChooserUI> {

    @Override
    public Class<javax.swing.plaf.metal.MetalFileChooserUI> createNewSUT() {
        return javax.swing.plaf.metal.MetalFileChooserUI.class;
    }

    @RunWith(J8Unit4.class)
    public static class FilterComboBoxRendererClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.metal.MetalFileChooserUIClassTests.FilterComboBoxRendererClassTests<javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer> {

        @Override
        public Class<javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer> createNewSUT() {
            return javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer.class;
        }

    }

}
