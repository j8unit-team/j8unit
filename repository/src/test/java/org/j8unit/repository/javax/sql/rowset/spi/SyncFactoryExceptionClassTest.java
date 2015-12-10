package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncFactoryExceptionClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncFactoryExceptionClassTests<javax.sql.rowset.spi.SyncFactoryException> {

    @Override
    public Class<javax.sql.rowset.spi.SyncFactoryException> createNewSUT() {
        return javax.sql.rowset.spi.SyncFactoryException.class;
    }

}
