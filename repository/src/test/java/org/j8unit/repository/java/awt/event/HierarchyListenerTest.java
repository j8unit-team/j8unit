package org.j8unit.repository.java.awt.event;

import java.awt.event.HierarchyListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HierarchyListenerTest
implements org.j8unit.repository.java.awt.event.HierarchyListenerTests<HierarchyListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.HierarchyListener]

    @Override
    public HierarchyListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.HierarchyListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.HierarchyListener]

}
