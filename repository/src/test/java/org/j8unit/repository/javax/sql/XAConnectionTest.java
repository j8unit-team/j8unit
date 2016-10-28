package org.j8unit.repository.javax.sql;

import javax.sql.XAConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XAConnectionTest
implements org.j8unit.repository.javax.sql.XAConnectionTests<XAConnection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.XAConnection]

    @Override
    public XAConnection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.XAConnection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.XAConnection]

}
