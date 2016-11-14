package org.j8unit.repository.javax.sql;

import javax.sql.RowSetReader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSetReader} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.RowSetReaderClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowSetReaderClassTest
implements RowSetReaderClassTests<RowSetReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSetReader]

    @Override
    public Class<RowSetReader> createNewSUT() {
        return RowSetReader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.RowSetReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSetReader]

}
