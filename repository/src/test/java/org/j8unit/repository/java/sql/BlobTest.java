package org.j8unit.repository.java.sql;

import java.sql.Blob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Blob} (by simply reusing the J8Unit
 * test interface {@link BlobTests}).
 */

@RunWith(J8Unit4.class)
public class BlobTest
implements BlobTests<Blob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Blob]

    @Override
    public Blob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Blob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Blob]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Blob]

}
