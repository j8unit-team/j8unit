package org.j8unit.repository.java.sql;

import java.sql.SQLData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SQLData} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.SQLDataClassTests}).
 */
@RunWith(J8Unit4.class)
public class SQLDataClassTest
implements SQLDataClassTests<SQLData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.SQLData]

    @Override
    public Class<SQLData> createNewSUT() {
        return SQLData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.SQLData]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.SQLData]

}
