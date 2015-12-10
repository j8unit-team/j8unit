package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicProgressBarUITest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicProgressBarUITests<javax.swing.plaf.basic.BasicProgressBarUI> {

    @RunWith(J8Unit4.class)
    public static class ChangeHandlerTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicProgressBarUITests.ChangeHandlerTests<javax.swing.plaf.basic.BasicProgressBarUI.ChangeHandler> {

        @Override
        public javax.swing.plaf.basic.BasicProgressBarUI.ChangeHandler createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.plaf.basic.BasicProgressBarUI.ChangeHandler] available.");
        }

    }

    @Override
    public javax.swing.plaf.basic.BasicProgressBarUI createNewSUT() {
        return new javax.swing.plaf.basic.BasicProgressBarUI();
    }

}
