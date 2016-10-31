package org.j8unit.repository.javax.sql;

import javax.sql.CommonDataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommonDataSourceClassTest
implements org.j8unit.repository.javax.sql.CommonDataSourceClassTests<CommonDataSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.CommonDataSource]

    @Override
    public Class<CommonDataSource> createNewSUT() {
        return CommonDataSource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.CommonDataSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.CommonDataSource]

}
