package org.j8unit.repository.java.sql;

import java.sql.DataTruncation;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataTruncationTest
implements org.j8unit.repository.java.sql.DataTruncationTests<DataTruncation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.DataTruncation]

    @Override
    public DataTruncation createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.DataTruncation], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.DataTruncation]

}
