package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetListenerClassTest
implements org.j8unit.repository.javax.sql.RowSetListenerClassTests<javax.sql.RowSetListener> {

    @Override
    public Class<javax.sql.RowSetListener> createNewSUT() {
        return javax.sql.RowSetListener.class;
    }

}
