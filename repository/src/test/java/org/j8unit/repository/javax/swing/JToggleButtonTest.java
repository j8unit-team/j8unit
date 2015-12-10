package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JToggleButtonTest
implements org.j8unit.repository.javax.swing.JToggleButtonTests<javax.swing.JToggleButton> {

    @RunWith(J8Unit4.class)
    public static class ToggleButtonModelTest
    implements org.j8unit.repository.javax.swing.JToggleButtonTests.ToggleButtonModelTests<javax.swing.JToggleButton.ToggleButtonModel> {

        @Override
        public javax.swing.JToggleButton.ToggleButtonModel createNewSUT() {
            return new javax.swing.JToggleButton.ToggleButtonModel();
        }

    }

    @Override
    public javax.swing.JToggleButton createNewSUT() {
        return new javax.swing.JToggleButton();
    }

}
