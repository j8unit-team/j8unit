package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeClassTest
implements org.j8unit.repository.java.sql.TimeClassTests<java.sql.Time> {

    @Override
    public Class<java.sql.Time> createNewSUT() {
        return java.sql.Time.class;
    }

}
