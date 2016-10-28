package org.j8unit.repository.java.awt.event;

import java.awt.event.WindowAdapter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WindowAdapterTest
implements org.j8unit.repository.java.awt.event.WindowAdapterTests<WindowAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.WindowAdapter]

    @Override
    public WindowAdapter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.WindowAdapter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.WindowAdapter]

}
