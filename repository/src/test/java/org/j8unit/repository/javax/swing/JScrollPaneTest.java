package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JScrollPaneTest
implements org.j8unit.repository.javax.swing.JScrollPaneTests<javax.swing.JScrollPane> {

    @Override
    public javax.swing.JScrollPane createNewSUT() {
        return new javax.swing.JScrollPane();
    }

}
