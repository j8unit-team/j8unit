package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.SyncResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncResolverTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncResolverTests<SyncResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.SyncResolver]

    @Override
    public SyncResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.spi.SyncResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.SyncResolver]

}
