package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Readable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.ReadableTests}).
 */

@RunWith(J8Unit4.class)
public class ReadableTest
implements ReadableTests<Readable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Readable]

    @Override
    public Readable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.Readable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Readable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Readable]

}
