package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncProviderExceptionClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncProviderExceptionClassTests<javax.sql.rowset.spi.SyncProviderException> {

    @Override
    public Class<javax.sql.rowset.spi.SyncProviderException> createNewSUT() {
        return javax.sql.rowset.spi.SyncProviderException.class;
    }

}
