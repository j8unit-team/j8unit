package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverManagerTest
implements org.j8unit.repository.java.sql.DriverManagerTests<java.sql.DriverManager> {

    @Override
    public java.sql.DriverManager createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.sql.DriverManager] available.");
    }

}
