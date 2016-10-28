package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.SyncResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncResolverClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncResolverClassTests<SyncResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.spi.SyncResolver]

    @Override
    public Class<SyncResolver> createNewSUT() {
        return SyncResolver.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.spi.SyncResolver]

}
