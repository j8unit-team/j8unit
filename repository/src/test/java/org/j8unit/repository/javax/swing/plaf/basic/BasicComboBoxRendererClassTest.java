package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicComboBoxRendererClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererClassTests<javax.swing.plaf.basic.BasicComboBoxRenderer> {

    @Override
    public Class<javax.swing.plaf.basic.BasicComboBoxRenderer> createNewSUT() {
        return javax.swing.plaf.basic.BasicComboBoxRenderer.class;
    }

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererClassTests.UIResourceClassTests<javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource> {

        @Override
        public Class<javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource> createNewSUT() {
            return javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource.class;
        }

    }

}
