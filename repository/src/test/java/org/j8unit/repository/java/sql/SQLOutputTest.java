package org.j8unit.repository.java.sql;

import java.sql.SQLOutput;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLOutputTest
implements org.j8unit.repository.java.sql.SQLOutputTests<SQLOutput> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.SQLOutput]

    @Override
    public SQLOutput createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.SQLOutput], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.SQLOutput]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.SQLOutput]

}
