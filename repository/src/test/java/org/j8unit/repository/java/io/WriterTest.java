package org.j8unit.repository.java.io;

import java.io.Writer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Writer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.io.WriterTests}).
 */

@RunWith(J8Unit4.class)
public class WriterTest
implements WriterTests<Writer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.Writer]

    @Override
    public Writer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.Writer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.Writer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.Writer]

}
