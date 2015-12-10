package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommonDataSourceClassTest
implements org.j8unit.repository.javax.sql.CommonDataSourceClassTests<javax.sql.CommonDataSource> {

    @Override
    public Class<javax.sql.CommonDataSource> createNewSUT() {
        return javax.sql.CommonDataSource.class;
    }

}
