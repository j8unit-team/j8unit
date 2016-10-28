package org.j8unit.repository.javax.swing;

import javax.swing.Action;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActionClassTest
implements org.j8unit.repository.javax.swing.ActionClassTests<Action> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Action]

    @Override
    public Class<Action> createNewSUT() {
        return Action.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Action]

}
