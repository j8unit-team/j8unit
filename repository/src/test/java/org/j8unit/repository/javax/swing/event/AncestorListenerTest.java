package org.j8unit.repository.javax.swing.event;

import javax.swing.event.AncestorListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AncestorListenerTest
implements org.j8unit.repository.javax.swing.event.AncestorListenerTests<AncestorListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.AncestorListener]

    @Override
    public AncestorListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.AncestorListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.AncestorListener]

}
