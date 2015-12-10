package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncProviderExceptionTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncProviderExceptionTests<javax.sql.rowset.spi.SyncProviderException> {

    @Override
    public javax.sql.rowset.spi.SyncProviderException createNewSUT() {
        return new javax.sql.rowset.spi.SyncProviderException();
    }

}
