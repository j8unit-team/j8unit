package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncFactoryExceptionTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncFactoryExceptionTests<javax.sql.rowset.spi.SyncFactoryException> {

    @Override
    public javax.sql.rowset.spi.SyncFactoryException createNewSUT() {
        return new javax.sql.rowset.spi.SyncFactoryException();
    }

}
