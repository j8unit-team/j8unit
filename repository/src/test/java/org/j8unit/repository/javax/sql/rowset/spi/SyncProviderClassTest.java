package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncProviderClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncProviderClassTests<javax.sql.rowset.spi.SyncProvider> {

    @Override
    public Class<javax.sql.rowset.spi.SyncProvider> createNewSUT() {
        return javax.sql.rowset.spi.SyncProvider.class;
    }

}
