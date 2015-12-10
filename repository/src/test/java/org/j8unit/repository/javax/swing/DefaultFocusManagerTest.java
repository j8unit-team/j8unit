package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultFocusManagerTest
implements org.j8unit.repository.javax.swing.DefaultFocusManagerTests<javax.swing.DefaultFocusManager> {

    @Override
    public javax.swing.DefaultFocusManager createNewSUT() {
        return new javax.swing.DefaultFocusManager();
    }

}
