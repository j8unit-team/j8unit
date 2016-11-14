package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.JdbcRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JdbcRowSet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sql.rowset.JdbcRowSetClassTests}).
 */

@RunWith(J8Unit4.class)
public class JdbcRowSetClassTest
implements JdbcRowSetClassTests<JdbcRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.JdbcRowSet]

    @Override
    public Class<JdbcRowSet> createNewSUT() {
        return JdbcRowSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.JdbcRowSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.JdbcRowSet]

}
