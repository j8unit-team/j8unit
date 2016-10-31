package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.TransactionalWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransactionalWriterClassTest
implements org.j8unit.repository.javax.sql.rowset.spi.TransactionalWriterClassTests<TransactionalWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.spi.TransactionalWriter]

    @Override
    public Class<TransactionalWriter> createNewSUT() {
        return TransactionalWriter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.spi.TransactionalWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.spi.TransactionalWriter]

}
