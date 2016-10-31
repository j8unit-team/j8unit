package org.j8unit.repository.java.sql;

import java.sql.Savepoint;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SavepointClassTest
implements org.j8unit.repository.java.sql.SavepointClassTests<Savepoint> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Savepoint]

    @Override
    public Class<Savepoint> createNewSUT() {
        return Savepoint.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Savepoint]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Savepoint]

}
