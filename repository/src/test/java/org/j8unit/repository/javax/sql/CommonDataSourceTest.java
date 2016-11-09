package org.j8unit.repository.javax.sql;

import javax.sql.CommonDataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CommonDataSource} (by simply reusing
 * the J8Unit test interface {@link CommonDataSourceTests}).
 */

@RunWith(J8Unit4.class)
public class CommonDataSourceTest
implements CommonDataSourceTests<CommonDataSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.CommonDataSource]

    @Override
    public CommonDataSource createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.CommonDataSource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.CommonDataSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.CommonDataSource]

}
