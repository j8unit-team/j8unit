package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.SyncResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SyncResolver} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.spi.SyncResolverTests}).
 */

@RunWith(J8Unit4.class)
public class SyncResolverTest
implements SyncResolverTests<SyncResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.spi.SyncResolver]

    @Override
    public SyncResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.spi.SyncResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.spi.SyncResolver]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.spi.SyncResolver]

}
