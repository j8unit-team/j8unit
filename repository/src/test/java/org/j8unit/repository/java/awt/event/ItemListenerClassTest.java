package org.j8unit.repository.java.awt.event;

import java.awt.event.ItemListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ItemListener} (by simply reusing the
 * J8Unit test interface {@link ItemListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ItemListenerClassTest
implements ItemListenerClassTests<ItemListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.ItemListener]

    @Override
    public Class<ItemListener> createNewSUT() {
        return ItemListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.ItemListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.ItemListener]

}
