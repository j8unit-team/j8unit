package org.j8unit.repository.javax.naming.event;

import javax.naming.event.NamingListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamingListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.event.NamingListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class NamingListenerClassTest
implements NamingListenerClassTests<NamingListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.event.NamingListener]

    @Override
    public Class<NamingListener> createNewSUT() {
        return NamingListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.event.NamingListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.event.NamingListener]

}
