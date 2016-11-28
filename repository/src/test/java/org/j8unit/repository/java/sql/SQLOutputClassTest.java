package org.j8unit.repository.java.sql;

import java.sql.SQLOutput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SQLOutput} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.SQLOutputClassTests}).
 */
@RunWith(J8Unit4.class)
public class SQLOutputClassTest
implements SQLOutputClassTests<SQLOutput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.SQLOutput]

    @Override
    public Class<SQLOutput> createNewSUT() {
        return SQLOutput.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.SQLOutput]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.SQLOutput]

}
