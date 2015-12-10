package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimestampClassTest
implements org.j8unit.repository.java.sql.TimestampClassTests<java.sql.Timestamp> {

    @Override
    public Class<java.sql.Timestamp> createNewSUT() {
        return java.sql.Timestamp.class;
    }

}
