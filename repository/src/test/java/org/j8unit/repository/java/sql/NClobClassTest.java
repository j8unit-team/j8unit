package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NClobClassTest
implements org.j8unit.repository.java.sql.NClobClassTests<java.sql.NClob> {

    @Override
    public Class<java.sql.NClob> createNewSUT() {
        return java.sql.NClob.class;
    }

}
