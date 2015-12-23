package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalComboBoxEditorTest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorTests<javax.swing.plaf.metal.MetalComboBoxEditor> {

    @Override
    public javax.swing.plaf.metal.MetalComboBoxEditor createNewSUT() {
        return new javax.swing.plaf.metal.MetalComboBoxEditor();
    }

    @RunWith(J8Unit4.class)
    public static class UIResourceTest
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxEditorTests.UIResourceTests<javax.swing.plaf.metal.MetalComboBoxEditor.UIResource> {

        @Override
        public javax.swing.plaf.metal.MetalComboBoxEditor.UIResource createNewSUT() {
            return new javax.swing.plaf.metal.MetalComboBoxEditor.UIResource();
        }

    }

}
