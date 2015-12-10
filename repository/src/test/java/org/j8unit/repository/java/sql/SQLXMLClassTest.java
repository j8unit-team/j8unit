package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLXMLClassTest
implements org.j8unit.repository.java.sql.SQLXMLClassTests<java.sql.SQLXML> {

    @Override
    public Class<java.sql.SQLXML> createNewSUT() {
        return java.sql.SQLXML.class;
    }

}
