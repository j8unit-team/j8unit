package org.j8unit.repository.javax.sql;

import javax.sql.XAConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XAConnection} (by simply reusing the
 * J8Unit test interface {@link XAConnectionTests}).
 */

@RunWith(J8Unit4.class)
public class XAConnectionTest
implements XAConnectionTests<XAConnection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.XAConnection]

    @Override
    public XAConnection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.XAConnection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.XAConnection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.XAConnection]

}
