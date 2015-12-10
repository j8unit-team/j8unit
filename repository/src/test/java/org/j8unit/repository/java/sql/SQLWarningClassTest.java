package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLWarningClassTest
implements org.j8unit.repository.java.sql.SQLWarningClassTests<java.sql.SQLWarning> {

    @Override
    public Class<java.sql.SQLWarning> createNewSUT() {
        return java.sql.SQLWarning.class;
    }

}
