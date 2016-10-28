package org.j8unit.repository.javax.sql;

import javax.sql.StatementEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StatementEventListenerClassTest
implements org.j8unit.repository.javax.sql.StatementEventListenerClassTests<StatementEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.StatementEventListener]

    @Override
    public Class<StatementEventListener> createNewSUT() {
        return StatementEventListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.StatementEventListener]

}
