package org.j8unit.repository.java.awt.event;

import java.awt.event.MouseMotionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MouseMotionListenerTest
implements org.j8unit.repository.java.awt.event.MouseMotionListenerTests<MouseMotionListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.MouseMotionListener]

    @Override
    public MouseMotionListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.MouseMotionListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.MouseMotionListener]

}
