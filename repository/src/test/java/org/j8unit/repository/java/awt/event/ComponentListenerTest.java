package org.j8unit.repository.java.awt.event;

import java.awt.event.ComponentListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentListenerTest
implements org.j8unit.repository.java.awt.event.ComponentListenerTests<ComponentListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.ComponentListener]

    @Override
    public ComponentListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.ComponentListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.ComponentListener]

}
