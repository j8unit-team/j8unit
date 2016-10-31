package org.j8unit.repository.javax.sql;

import javax.sql.ConnectionEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionEventListenerTest
implements org.j8unit.repository.javax.sql.ConnectionEventListenerTests<ConnectionEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.ConnectionEventListener]

    @Override
    public ConnectionEventListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.ConnectionEventListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.ConnectionEventListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.ConnectionEventListener]

}
