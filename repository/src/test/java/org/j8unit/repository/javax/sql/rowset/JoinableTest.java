package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.Joinable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JoinableTest
implements org.j8unit.repository.javax.sql.rowset.JoinableTests<Joinable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.Joinable]

    @Override
    public Joinable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.Joinable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.Joinable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.Joinable]

}
