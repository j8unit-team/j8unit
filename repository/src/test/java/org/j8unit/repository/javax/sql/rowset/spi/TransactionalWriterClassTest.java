package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransactionalWriterClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.TransactionalWriterClassTests<javax.sql.rowset.spi.TransactionalWriter> {

    @Override
    public Class<javax.sql.rowset.spi.TransactionalWriter> createNewSUT() {
        return javax.sql.rowset.spi.TransactionalWriter.class;
    }

}
