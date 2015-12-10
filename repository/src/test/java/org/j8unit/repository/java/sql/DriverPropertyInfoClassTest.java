package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverPropertyInfoClassTest
implements org.j8unit.repository.java.sql.DriverPropertyInfoClassTests<java.sql.DriverPropertyInfo> {

    @Override
    public Class<java.sql.DriverPropertyInfo> createNewSUT() {
        return java.sql.DriverPropertyInfo.class;
    }

}
