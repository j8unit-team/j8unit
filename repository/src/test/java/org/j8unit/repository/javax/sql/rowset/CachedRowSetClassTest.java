package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.CachedRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CachedRowSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.CachedRowSetClassTests}).
 */

@RunWith(J8Unit4.class)
public class CachedRowSetClassTest
implements CachedRowSetClassTests<CachedRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.CachedRowSet]

    @Override
    public Class<CachedRowSet> createNewSUT() {
        return CachedRowSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.CachedRowSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.CachedRowSet]

}
