package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncFactoryClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.SyncFactoryClassTests<javax.sql.rowset.spi.SyncFactory> {

    @Override
    public Class<javax.sql.rowset.spi.SyncFactory> createNewSUT() {
        return javax.sql.rowset.spi.SyncFactory.class;
    }

}
