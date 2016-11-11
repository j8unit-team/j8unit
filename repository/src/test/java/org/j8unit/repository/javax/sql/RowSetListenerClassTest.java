package org.j8unit.repository.javax.sql;

import javax.sql.RowSetListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSetListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.RowSetListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowSetListenerClassTest
implements RowSetListenerClassTests<RowSetListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSetListener]

    @Override
    public Class<RowSetListener> createNewSUT() {
        return RowSetListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.RowSetListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSetListener]

}
