package org.j8unit.repository.javax.sql;

import javax.sql.ConnectionEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionEventListenerClassTest
implements org.j8unit.repository.javax.sql.ConnectionEventListenerClassTests<ConnectionEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.ConnectionEventListener]

    @Override
    public Class<ConnectionEventListener> createNewSUT() {
        return ConnectionEventListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.ConnectionEventListener]

}
