package org.j8unit.repository.java.io;

import java.io.Reader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Reader} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.io.ReaderTests}).
 */
@RunWith(J8Unit4.class)
public class ReaderTest
implements ReaderTests<Reader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.Reader]

    @Override
    public Reader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.Reader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.Reader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.Reader]

}
