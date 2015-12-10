package org.j8unit.repository.java.awt.dnd;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DropTargetTest
implements org.j8unit.repository.java.awt.dnd.DropTargetTests<java.awt.dnd.DropTarget> {

    @Override
    public java.awt.dnd.DropTarget createNewSUT() {
        return new java.awt.dnd.DropTarget();
    }

}
