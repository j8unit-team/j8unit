package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalComboBoxEditorClassTest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests<javax.swing.plaf.metal.MetalComboBoxEditor> {

    @Override
    public Class<javax.swing.plaf.metal.MetalComboBoxEditor> createNewSUT() {
        return javax.swing.plaf.metal.MetalComboBoxEditor.class;
    }

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorClassTests.UIResourceClassTests<javax.swing.plaf.metal.MetalComboBoxEditor.UIResource> {

        @Override
        public Class<javax.swing.plaf.metal.MetalComboBoxEditor.UIResource> createNewSUT() {
            return javax.swing.plaf.metal.MetalComboBoxEditor.UIResource.class;
        }

    }

}
