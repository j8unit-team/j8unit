package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicMenuUITest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUITests<javax.swing.plaf.basic.BasicMenuUI> {

    @RunWith(J8Unit4.class)
    public static class ChangeHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUITests.ChangeHandlerTests<javax.swing.plaf.basic.BasicMenuUI.ChangeHandler> {

        @Override
        public javax.swing.plaf.basic.BasicMenuUI.ChangeHandler createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.plaf.basic.BasicMenuUI.ChangeHandler] available.");
        }

    }

    @Override
    public javax.swing.plaf.basic.BasicMenuUI createNewSUT() {
        return new javax.swing.plaf.basic.BasicMenuUI();
    }

}
