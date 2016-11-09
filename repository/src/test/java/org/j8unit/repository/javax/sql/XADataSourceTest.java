package org.j8unit.repository.javax.sql;

import javax.sql.XADataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XADataSource} (by simply reusing the
 * J8Unit test interface {@link XADataSourceTests}).
 */

@RunWith(J8Unit4.class)
public class XADataSourceTest
implements XADataSourceTests<XADataSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.XADataSource]

    @Override
    public XADataSource createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.XADataSource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.XADataSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.XADataSource]

}
