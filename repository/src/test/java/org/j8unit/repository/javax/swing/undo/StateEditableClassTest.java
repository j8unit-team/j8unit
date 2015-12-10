package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StateEditableClassTest
implements org.j8unit.repository.javax.swing.undo.StateEditableClassTests<javax.swing.undo.StateEditable> {

    @Override
    public Class<javax.swing.undo.StateEditable> createNewSUT() {
        return javax.swing.undo.StateEditable.class;
    }

}
