package org.j8unit.repository.java.sql;

import java.sql.Clob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClobTest
implements org.j8unit.repository.java.sql.ClobTests<Clob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Clob]

    @Override
    public Clob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Clob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Clob]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Clob]

}
