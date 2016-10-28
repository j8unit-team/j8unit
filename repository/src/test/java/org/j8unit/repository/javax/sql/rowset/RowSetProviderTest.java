package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.RowSetProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetProviderTest
implements org.j8unit.repository.javax.sql.rowset.RowSetProviderTests<RowSetProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.RowSetProvider]

    @Override
    public RowSetProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sql.rowset.RowSetProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.RowSetProvider]

}
