package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.RowSetFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RowSetFactory} (by simply reusing the
 * J8Unit test interface {@link RowSetFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class RowSetFactoryClassTest
implements RowSetFactoryClassTests<RowSetFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.RowSetFactory]

    @Override
    public Class<RowSetFactory> createNewSUT() {
        return RowSetFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.RowSetFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.RowSetFactory]

}
