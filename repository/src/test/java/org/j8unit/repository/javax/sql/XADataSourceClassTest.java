package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XADataSourceClassTest
implements org.j8unit.repository.javax.sql.XADataSourceClassTests<javax.sql.XADataSource> {

    @Override
    public Class<javax.sql.XADataSource> createNewSUT() {
        return javax.sql.XADataSource.class;
    }

}
