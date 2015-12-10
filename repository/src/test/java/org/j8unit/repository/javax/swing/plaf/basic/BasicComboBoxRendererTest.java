package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicComboBoxRendererTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests<javax.swing.plaf.basic.BasicComboBoxRenderer> {

    @RunWith(J8Unit4.class)
    public static class UIResourceTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests.UIResourceTests<javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource> {

        @Override
        public javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource createNewSUT() {
            return new javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource();
        }

    }

    @Override
    public javax.swing.plaf.basic.BasicComboBoxRenderer createNewSUT() {
        return new javax.swing.plaf.basic.BasicComboBoxRenderer();
    }

}
