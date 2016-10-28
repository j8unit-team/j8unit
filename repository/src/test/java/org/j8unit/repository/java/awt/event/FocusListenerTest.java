package org.j8unit.repository.java.awt.event;

import java.awt.event.FocusListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FocusListenerTest
implements org.j8unit.repository.java.awt.event.FocusListenerTests<FocusListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.FocusListener]

    @Override
    public FocusListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.FocusListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.FocusListener]

}
