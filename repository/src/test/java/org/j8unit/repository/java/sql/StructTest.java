package org.j8unit.repository.java.sql;

import java.sql.Struct;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StructTest
implements org.j8unit.repository.java.sql.StructTests<Struct> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Struct]

    @Override
    public Struct createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Struct], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Struct]

}
