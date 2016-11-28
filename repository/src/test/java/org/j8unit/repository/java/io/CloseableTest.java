package org.j8unit.repository.java.io;

import java.io.Closeable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Closeable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.CloseableTests}).
 */
@RunWith(J8Unit4.class)
public class CloseableTest
implements CloseableTests<Closeable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.Closeable]

    @Override
    public Closeable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.Closeable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.Closeable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.Closeable]

}
