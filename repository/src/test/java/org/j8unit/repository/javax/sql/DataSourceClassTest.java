package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataSourceClassTest
implements org.j8unit.repository.javax.sql.DataSourceClassTests<javax.sql.DataSource> {

    @Override
    public Class<javax.sql.DataSource> createNewSUT() {
        return javax.sql.DataSource.class;
    }

}
