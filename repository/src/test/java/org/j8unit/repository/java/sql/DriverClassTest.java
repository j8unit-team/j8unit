package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverClassTest
implements org.j8unit.repository.java.sql.DriverClassTests<java.sql.Driver> {

    @Override
    public Class<java.sql.Driver> createNewSUT() {
        return java.sql.Driver.class;
    }

}
