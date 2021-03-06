package org.j8unit.repository.javax.sql;

import javax.sql.ConnectionEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConnectionEventListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.sql.ConnectionEventListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ConnectionEventListenerClassTest
implements ConnectionEventListenerClassTests<ConnectionEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.ConnectionEventListener]

    @Override
    public Class<ConnectionEventListener> createNewSUT() {
        return ConnectionEventListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.ConnectionEventListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.ConnectionEventListener]

}
