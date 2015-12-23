package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class JComboBoxClassTest
implements org.j8unit.repository.javax.swing.JComboBoxClassTests<javax.swing.JComboBox> {

    @Override
    public Class<javax.swing.JComboBox> createNewSUT() {
        return javax.swing.JComboBox.class;
    }

    @RunWith(J8Unit4.class)
    public static class KeySelectionManagerClassTest
    implements org.j8unit.repository.javax.swing.JComboBoxClassTests.KeySelectionManagerClassTests<javax.swing.JComboBox.KeySelectionManager> {

        @Override
        public Class<javax.swing.JComboBox.KeySelectionManager> createNewSUT() {
            return javax.swing.JComboBox.KeySelectionManager.class;
        }

    }

}
