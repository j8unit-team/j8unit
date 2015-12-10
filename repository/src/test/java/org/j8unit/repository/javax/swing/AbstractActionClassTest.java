package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractActionClassTest
implements org.j8unit.repository.javax.swing.AbstractActionClassTests<javax.swing.AbstractAction> {

    @Override
    public Class<javax.swing.AbstractAction> createNewSUT() {
        return javax.swing.AbstractAction.class;
    }

}
