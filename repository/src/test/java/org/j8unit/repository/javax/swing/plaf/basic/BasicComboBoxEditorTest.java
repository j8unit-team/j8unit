package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicComboBoxEditorTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorTests<javax.swing.plaf.basic.BasicComboBoxEditor> {

    @RunWith(J8Unit4.class)
    public static class UIResourceTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorTests.UIResourceTests<javax.swing.plaf.basic.BasicComboBoxEditor.UIResource> {

        @Override
        public javax.swing.plaf.basic.BasicComboBoxEditor.UIResource createNewSUT() {
            return new javax.swing.plaf.basic.BasicComboBoxEditor.UIResource();
        }

    }

    @Override
    public javax.swing.plaf.basic.BasicComboBoxEditor createNewSUT() {
        return new javax.swing.plaf.basic.BasicComboBoxEditor();
    }

}
