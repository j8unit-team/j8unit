package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateClassTest
implements org.j8unit.repository.java.sql.DateClassTests<java.sql.Date> {

    @Override
    public Class<java.sql.Date> createNewSUT() {
        return java.sql.Date.class;
    }

}
