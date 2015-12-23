package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicTableHeaderUITest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicTableHeaderUITests<javax.swing.plaf.basic.BasicTableHeaderUI> {

    @Override
    public javax.swing.plaf.basic.BasicTableHeaderUI createNewSUT() {
        return new javax.swing.plaf.basic.BasicTableHeaderUI();
    }

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicTableHeaderUITests.MouseInputHandlerTests<javax.swing.plaf.basic.BasicTableHeaderUI.MouseInputHandler> {

        @Override
        public javax.swing.plaf.basic.BasicTableHeaderUI.MouseInputHandler createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.plaf.basic.BasicTableHeaderUI.MouseInputHandler] available.");
        }

    }

}
