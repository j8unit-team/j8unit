package org.j8unit.repository.java.sql;

import java.sql.Array;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayTest
implements org.j8unit.repository.java.sql.ArrayTests<Array> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Array]

    @Override
    public Array createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Array], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Array]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Array]

}
