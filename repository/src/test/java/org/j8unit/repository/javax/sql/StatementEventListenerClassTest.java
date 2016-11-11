package org.j8unit.repository.javax.sql;

import javax.sql.StatementEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StatementEventListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.sql.StatementEventListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class StatementEventListenerClassTest
implements StatementEventListenerClassTests<StatementEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.StatementEventListener]

    @Override
    public Class<StatementEventListener> createNewSUT() {
        return StatementEventListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.StatementEventListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.StatementEventListener]

}
