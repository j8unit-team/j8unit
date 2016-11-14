package org.j8unit.repository.java.sql;

import java.sql.DatabaseMetaData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DatabaseMetaData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.DatabaseMetaDataClassTests}).
 */

@RunWith(J8Unit4.class)
public class DatabaseMetaDataClassTest
implements DatabaseMetaDataClassTests<DatabaseMetaData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.DatabaseMetaData]

    @Override
    public Class<DatabaseMetaData> createNewSUT() {
        return DatabaseMetaData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.DatabaseMetaData]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.DatabaseMetaData]

}
