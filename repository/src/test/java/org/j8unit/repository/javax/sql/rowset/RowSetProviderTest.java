package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.RowSetProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RowSetProvider} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.RowSetProviderTests}).
 */

@RunWith(J8Unit4.class)
public class RowSetProviderTest
implements RowSetProviderTests<RowSetProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.RowSetProvider]

    @Override
    public RowSetProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sql.rowset.RowSetProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.RowSetProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.RowSetProvider]

}
