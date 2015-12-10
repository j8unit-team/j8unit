package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JToggleButtonClassTest
implements org.j8unit.repository.javax.swing.JToggleButtonClassTests<javax.swing.JToggleButton> {

    @RunWith(J8Unit4.class)
    public static class ToggleButtonModelClassTest
    implements org.j8unit.repository.javax.swing.JToggleButtonClassTests.ToggleButtonModelClassTests<javax.swing.JToggleButton.ToggleButtonModel> {

        @Override
        public Class<javax.swing.JToggleButton.ToggleButtonModel> createNewSUT() {
            return javax.swing.JToggleButton.ToggleButtonModel.class;
        }

    }

    @Override
    public Class<javax.swing.JToggleButton> createNewSUT() {
        return javax.swing.JToggleButton.class;
    }

}
