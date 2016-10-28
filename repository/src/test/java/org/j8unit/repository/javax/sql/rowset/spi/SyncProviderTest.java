package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.SyncProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncProviderTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncProviderTests<SyncProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.SyncProvider]

    @Override
    public SyncProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.spi.SyncProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.SyncProvider]

}
