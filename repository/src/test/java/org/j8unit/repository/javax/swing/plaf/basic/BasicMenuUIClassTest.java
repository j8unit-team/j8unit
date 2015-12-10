package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicMenuUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUIClassTests<javax.swing.plaf.basic.BasicMenuUI> {

    @RunWith(J8Unit4.class)
    public static class ChangeHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUIClassTests.ChangeHandlerClassTests<javax.swing.plaf.basic.BasicMenuUI.ChangeHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicMenuUI.ChangeHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicMenuUI.ChangeHandler.class;
        }

    }

    @Override
    public Class<javax.swing.plaf.basic.BasicMenuUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicMenuUI.class;
    }

}
