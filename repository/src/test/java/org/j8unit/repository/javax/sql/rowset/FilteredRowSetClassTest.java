package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.FilteredRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FilteredRowSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.FilteredRowSetClassTests}).
 */
@RunWith(J8Unit4.class)
public class FilteredRowSetClassTest
implements FilteredRowSetClassTests<FilteredRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.FilteredRowSet]

    @Override
    public Class<FilteredRowSet> createNewSUT() {
        return FilteredRowSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.FilteredRowSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.FilteredRowSet]

}
