package org.j8unit.repository.java.awt.event;

import java.awt.event.ComponentAdapter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentAdapterTest
implements org.j8unit.repository.java.awt.event.ComponentAdapterTests<ComponentAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.ComponentAdapter]

    @Override
    public ComponentAdapter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.ComponentAdapter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.ComponentAdapter]

}
