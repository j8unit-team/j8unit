package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.WebRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebRowSet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sql.rowset.WebRowSetClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebRowSetClassTest
implements WebRowSetClassTests<WebRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.WebRowSet]

    @Override
    public Class<WebRowSet> createNewSUT() {
        return WebRowSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.WebRowSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.WebRowSet]

}
