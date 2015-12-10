package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResultSetClassTest
implements org.j8unit.repository.java.sql.ResultSetClassTests<java.sql.ResultSet> {

    @Override
    public Class<java.sql.ResultSet> createNewSUT() {
        return java.sql.ResultSet.class;
    }

}
