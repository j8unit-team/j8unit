package org.j8unit.repository.javax.sql;

import javax.sql.XADataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XADataSourceClassTest
implements org.j8unit.repository.javax.sql.XADataSourceClassTests<XADataSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.XADataSource]

    @Override
    public Class<XADataSource> createNewSUT() {
        return XADataSource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.XADataSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.XADataSource]

}
