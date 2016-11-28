package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.JoinRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JoinRowSet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sql.rowset.JoinRowSetClassTests}).
 */
@RunWith(J8Unit4.class)
public class JoinRowSetClassTest
implements JoinRowSetClassTests<JoinRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.JoinRowSet]

    @Override
    public Class<JoinRowSet> createNewSUT() {
        return JoinRowSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.JoinRowSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.JoinRowSet]

}
