package org.j8unit.repository.javax.naming.event;

import javax.naming.event.ObjectChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectChangeListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.event.ObjectChangeListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectChangeListenerClassTest
implements ObjectChangeListenerClassTests<ObjectChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.event.ObjectChangeListener]

    @Override
    public Class<ObjectChangeListener> createNewSUT() {
        return ObjectChangeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.event.ObjectChangeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.event.ObjectChangeListener]

}
