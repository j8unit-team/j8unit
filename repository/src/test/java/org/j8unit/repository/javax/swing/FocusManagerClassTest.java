package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FocusManagerClassTest
implements org.j8unit.repository.javax.swing.FocusManagerClassTests<javax.swing.FocusManager> {

    @Override
    public Class<javax.swing.FocusManager> createNewSUT() {
        return javax.swing.FocusManager.class;
    }

}
