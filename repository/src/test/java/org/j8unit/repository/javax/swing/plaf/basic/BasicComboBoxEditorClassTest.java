package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicComboBoxEditorClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorClassTests<javax.swing.plaf.basic.BasicComboBoxEditor> {

    @Override
    public Class<javax.swing.plaf.basic.BasicComboBoxEditor> createNewSUT() {
        return javax.swing.plaf.basic.BasicComboBoxEditor.class;
    }

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxEditorClassTests.UIResourceClassTests<javax.swing.plaf.basic.BasicComboBoxEditor.UIResource> {

        @Override
        public Class<javax.swing.plaf.basic.BasicComboBoxEditor.UIResource> createNewSUT() {
            return javax.swing.plaf.basic.BasicComboBoxEditor.UIResource.class;
        }

    }

}
