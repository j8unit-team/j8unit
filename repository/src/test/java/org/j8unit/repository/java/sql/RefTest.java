package org.j8unit.repository.java.sql;

import java.sql.Ref;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefTest
implements org.j8unit.repository.java.sql.RefTests<Ref> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Ref]

    @Override
    public Ref createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Ref], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Ref]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Ref]

}
