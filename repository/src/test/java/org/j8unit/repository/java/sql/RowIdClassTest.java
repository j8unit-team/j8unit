package org.j8unit.repository.java.sql;

import java.sql.RowId;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowId} (by simply reusing the J8Unit test
 * interface {@link RowIdClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowIdClassTest
implements RowIdClassTests<RowId> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.RowId]

    @Override
    public Class<RowId> createNewSUT() {
        return RowId.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.RowId]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.RowId]

}
