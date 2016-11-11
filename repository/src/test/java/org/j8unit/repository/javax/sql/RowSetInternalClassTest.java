package org.j8unit.repository.javax.sql;

import javax.sql.RowSetInternal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSetInternal} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.RowSetInternalClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowSetInternalClassTest
implements RowSetInternalClassTests<RowSetInternal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSetInternal]

    @Override
    public Class<RowSetInternal> createNewSUT() {
        return RowSetInternal.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.RowSetInternal]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSetInternal]

}
