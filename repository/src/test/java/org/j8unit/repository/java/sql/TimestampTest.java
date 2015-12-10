package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimestampTest
implements org.j8unit.repository.java.sql.TimestampTests<java.sql.Timestamp> {

    @Override
    public java.sql.Timestamp createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.sql.Timestamp] available.");
    }

}
