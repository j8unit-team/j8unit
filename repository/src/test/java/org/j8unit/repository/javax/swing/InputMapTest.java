package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputMapTest
implements org.j8unit.repository.javax.swing.InputMapTests<javax.swing.InputMap> {

    @Override
    public javax.swing.InputMap createNewSUT() {
        return new javax.swing.InputMap();
    }

}