package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.TransactionalWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TransactionalWriter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.spi.TransactionalWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class TransactionalWriterClassTest
implements TransactionalWriterClassTests<TransactionalWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.spi.TransactionalWriter]

    @Override
    public Class<TransactionalWriter> createNewSUT() {
        return TransactionalWriter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.spi.TransactionalWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.spi.TransactionalWriter]

}
