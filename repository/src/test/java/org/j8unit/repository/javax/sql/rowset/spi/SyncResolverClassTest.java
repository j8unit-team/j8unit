package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.SyncResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SyncResolver} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.spi.SyncResolverClassTests}).
 */
@RunWith(J8Unit4.class)
public class SyncResolverClassTest
implements SyncResolverClassTests<SyncResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.spi.SyncResolver]

    @Override
    public Class<SyncResolver> createNewSUT() {
        return SyncResolver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.spi.SyncResolver]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.spi.SyncResolver]

}
