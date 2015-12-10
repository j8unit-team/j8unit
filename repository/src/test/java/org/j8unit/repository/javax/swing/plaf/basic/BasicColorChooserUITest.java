package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicColorChooserUITest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUITests<javax.swing.plaf.basic.BasicColorChooserUI> {

    @RunWith(J8Unit4.class)
    public static class PropertyHandlerTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUITests.PropertyHandlerTests<javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler> {

        @Override
        public javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler] available.");
        }

    }

    @Override
    public javax.swing.plaf.basic.BasicColorChooserUI createNewSUT() {
        return new javax.swing.plaf.basic.BasicColorChooserUI();
    }

}
