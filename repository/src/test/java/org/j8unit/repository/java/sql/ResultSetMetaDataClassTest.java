package org.j8unit.repository.java.sql;

import java.sql.ResultSetMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ResultSetMetaData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.ResultSetMetaDataClassTests}).
 */
@RunWith(J8Unit4.class)
public class ResultSetMetaDataClassTest
implements ResultSetMetaDataClassTests<ResultSetMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.ResultSetMetaData]

    @Override
    public Class<ResultSetMetaData> createNewSUT() {
        return ResultSetMetaData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.ResultSetMetaData]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.ResultSetMetaData]

}
