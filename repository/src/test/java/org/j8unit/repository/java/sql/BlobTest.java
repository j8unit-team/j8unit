package org.j8unit.repository.java.sql;

import java.sql.Blob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BlobTest
implements org.j8unit.repository.java.sql.BlobTests<Blob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Blob]

    @Override
    public Blob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Blob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Blob]

}
