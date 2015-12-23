package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicColorChooserUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUIClassTests<javax.swing.plaf.basic.BasicColorChooserUI> {

    @Override
    public Class<javax.swing.plaf.basic.BasicColorChooserUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicColorChooserUI.class;
    }

    @RunWith(J8Unit4.class)
    public static class PropertyHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUIClassTests.PropertyHandlerClassTests<javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler.class;
        }

    }

}
