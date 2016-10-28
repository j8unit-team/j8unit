package org.j8unit.repository.java.awt.event;

import java.awt.event.AWTEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTEventListenerTest
implements org.j8unit.repository.java.awt.event.AWTEventListenerTests<AWTEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.AWTEventListener]

    @Override
    public AWTEventListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.AWTEventListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.AWTEventListener]

}
