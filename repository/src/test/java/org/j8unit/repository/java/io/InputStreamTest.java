package org.j8unit.repository.java.io;

import java.io.InputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.InputStreamTests}).
 */
@RunWith(J8Unit4.class)
public class InputStreamTest
implements InputStreamTests<InputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.InputStream]

    @Override
    public InputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.InputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.InputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.InputStream]

}
