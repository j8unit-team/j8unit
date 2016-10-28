package org.j8unit.repository.java.sql;

import java.sql.SQLOutput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLOutputClassTest
implements org.j8unit.repository.java.sql.SQLOutputClassTests<SQLOutput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.SQLOutput]

    @Override
    public Class<SQLOutput> createNewSUT() {
        return SQLOutput.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.SQLOutput]

}
