package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClobClassTest
implements org.j8unit.repository.java.sql.ClobClassTests<java.sql.Clob> {

    @Override
    public Class<java.sql.Clob> createNewSUT() {
        return java.sql.Clob.class;
    }

}
