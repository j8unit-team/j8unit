package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverManagerClassTest
implements org.j8unit.repository.java.sql.DriverManagerClassTests<java.sql.DriverManager> {

    @Override
    public Class<java.sql.DriverManager> createNewSUT() {
        return java.sql.DriverManager.class;
    }

}
