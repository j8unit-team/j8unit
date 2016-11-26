package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.SyncProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SyncProvider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.spi.SyncProviderTests}).
 */
@RunWith(J8Unit4.class)
public class SyncProviderTest
implements SyncProviderTests<SyncProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.SyncProvider]

    @Override
    public SyncProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.spi.SyncProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.spi.SyncProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.spi.SyncProvider]

}
