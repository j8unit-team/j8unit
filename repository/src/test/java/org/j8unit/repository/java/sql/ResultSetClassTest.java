package org.j8unit.repository.java.sql;

import java.sql.ResultSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ResultSet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.ResultSetClassTests}).
 */
@RunWith(J8Unit4.class)
public class ResultSetClassTest
implements ResultSetClassTests<ResultSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.ResultSet]

    @Override
    public Class<ResultSet> createNewSUT() {
        return ResultSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.ResultSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.ResultSet]

}
