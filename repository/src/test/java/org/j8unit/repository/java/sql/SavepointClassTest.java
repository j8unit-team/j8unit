package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SavepointClassTest
implements org.j8unit.repository.java.sql.SavepointClassTests<java.sql.Savepoint> {

    @Override
    public Class<java.sql.Savepoint> createNewSUT() {
        return java.sql.Savepoint.class;
    }

}
