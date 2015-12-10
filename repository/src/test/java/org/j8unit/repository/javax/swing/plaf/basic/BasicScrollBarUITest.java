package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicScrollBarUITest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicScrollBarUITests<javax.swing.plaf.basic.BasicScrollBarUI> {

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicScrollBarUITests.PropertyChangeHandlerTests<javax.swing.plaf.basic.BasicScrollBarUI.PropertyChangeHandler> {

        @Override
        public javax.swing.plaf.basic.BasicScrollBarUI.PropertyChangeHandler createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.plaf.basic.BasicScrollBarUI.PropertyChangeHandler] available.");
        }

    }

    @Override
    public javax.swing.plaf.basic.BasicScrollBarUI createNewSUT() {
        return new javax.swing.plaf.basic.BasicScrollBarUI();
    }

}
