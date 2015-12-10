package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JScrollPaneClassTest
implements org.j8unit.repository.javax.swing.JScrollPaneClassTests<javax.swing.JScrollPane> {

    @Override
    public Class<javax.swing.JScrollPane> createNewSUT() {
        return javax.swing.JScrollPane.class;
    }

}
