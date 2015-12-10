package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatabaseMetaDataClassTest
implements org.j8unit.repository.java.sql.DatabaseMetaDataClassTests<java.sql.DatabaseMetaData> {

    @Override
    public Class<java.sql.DatabaseMetaData> createNewSUT() {
        return java.sql.DatabaseMetaData.class;
    }

}
