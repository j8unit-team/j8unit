package org.j8unit.repository.java.sql;

import java.sql.Driver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverClassTest
implements org.j8unit.repository.java.sql.DriverClassTests<Driver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Driver]

    @Override
    public Class<Driver> createNewSUT() {
        return Driver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Driver]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Driver]

}
