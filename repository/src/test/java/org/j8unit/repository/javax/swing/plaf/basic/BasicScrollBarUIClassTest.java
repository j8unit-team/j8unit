package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicScrollBarUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicScrollBarUIClassTests<javax.swing.plaf.basic.BasicScrollBarUI> {

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicScrollBarUIClassTests.PropertyChangeHandlerClassTests<javax.swing.plaf.basic.BasicScrollBarUI.PropertyChangeHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicScrollBarUI.PropertyChangeHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicScrollBarUI.PropertyChangeHandler.class;
        }

    }

    @Override
    public Class<javax.swing.plaf.basic.BasicScrollBarUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicScrollBarUI.class;
    }

}
