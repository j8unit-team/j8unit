package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActionClassTest
implements org.j8unit.repository.javax.swing.ActionClassTests<javax.swing.Action> {

    @Override
    public Class<javax.swing.Action> createNewSUT() {
        return javax.swing.Action.class;
    }

}
