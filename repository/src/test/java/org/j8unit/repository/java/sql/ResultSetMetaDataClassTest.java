package org.j8unit.repository.java.sql;

import java.sql.ResultSetMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResultSetMetaDataClassTest
implements org.j8unit.repository.java.sql.ResultSetMetaDataClassTests<ResultSetMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.ResultSetMetaData]

    @Override
    public Class<ResultSetMetaData> createNewSUT() {
        return ResultSetMetaData.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.ResultSetMetaData]

}
