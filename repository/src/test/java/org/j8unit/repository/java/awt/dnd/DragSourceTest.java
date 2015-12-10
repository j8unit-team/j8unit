package org.j8unit.repository.java.awt.dnd;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DragSourceTest
implements org.j8unit.repository.java.awt.dnd.DragSourceTests<java.awt.dnd.DragSource> {

    @Override
    public java.awt.dnd.DragSource createNewSUT() {
        return new java.awt.dnd.DragSource();
    }

}
