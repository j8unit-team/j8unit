package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicProgressBarUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicProgressBarUIClassTests<javax.swing.plaf.basic.BasicProgressBarUI> {

    @RunWith(J8Unit4.class)
    public static class ChangeHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicProgressBarUIClassTests.ChangeHandlerClassTests<javax.swing.plaf.basic.BasicProgressBarUI.ChangeHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicProgressBarUI.ChangeHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicProgressBarUI.ChangeHandler.class;
        }

    }

    @Override
    public Class<javax.swing.plaf.basic.BasicProgressBarUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicProgressBarUI.class;
    }

}
