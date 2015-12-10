package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncResolverClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncResolverClassTests<javax.sql.rowset.spi.SyncResolver> {

    @Override
    public Class<javax.sql.rowset.spi.SyncResolver> createNewSUT() {
        return javax.sql.rowset.spi.SyncResolver.class;
    }

}
