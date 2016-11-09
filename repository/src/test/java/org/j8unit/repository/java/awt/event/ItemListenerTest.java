package org.j8unit.repository.java.awt.event;

import java.awt.event.ItemListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ItemListener} (by simply reusing the
 * J8Unit test interface {@link ItemListenerTests}).
 */

@RunWith(J8Unit4.class)
public class ItemListenerTest
implements ItemListenerTests<ItemListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.ItemListener]

    @Override
    public ItemListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.ItemListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.ItemListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.ItemListener]

}
