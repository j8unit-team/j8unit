package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JScrollBarTest
implements org.j8unit.repository.javax.swing.JScrollBarTests<javax.swing.JScrollBar> {

    @Override
    public javax.swing.JScrollBar createNewSUT() {
        return new javax.swing.JScrollBar();
    }

}
