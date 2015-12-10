package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DropModeClassTest
implements org.j8unit.repository.javax.swing.DropModeClassTests<javax.swing.DropMode> {

    @Override
    public Class<javax.swing.DropMode> createNewSUT() {
        return javax.swing.DropMode.class;
    }

}
