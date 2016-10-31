package org.j8unit.repository.javax.sql;

import javax.sql.RowSetListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetListenerTest
implements org.j8unit.repository.javax.sql.RowSetListenerTests<RowSetListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetListener]

    @Override
    public RowSetListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.RowSetListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.RowSetListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.RowSetListener]

}
