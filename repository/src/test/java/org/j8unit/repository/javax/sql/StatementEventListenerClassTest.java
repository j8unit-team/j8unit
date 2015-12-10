package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StatementEventListenerClassTest
implements org.j8unit.repository.javax.sql.StatementEventListenerClassTests<javax.sql.StatementEventListener> {

    @Override
    public Class<javax.sql.StatementEventListener> createNewSUT() {
        return javax.sql.StatementEventListener.class;
    }

}
