package org.j8unit.repository.java.awt.event;

import java.awt.event.MouseListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MouseListenerTest
implements org.j8unit.repository.java.awt.event.MouseListenerTests<MouseListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.MouseListener]

    @Override
    public MouseListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.MouseListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.MouseListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.MouseListener]

}
