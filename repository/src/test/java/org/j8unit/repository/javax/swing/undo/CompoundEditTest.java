package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompoundEditTest
implements org.j8unit.repository.javax.swing.undo.CompoundEditTests<javax.swing.undo.CompoundEdit> {

    @Override
    public javax.swing.undo.CompoundEdit createNewSUT() {
        return new javax.swing.undo.CompoundEdit();
    }

}
