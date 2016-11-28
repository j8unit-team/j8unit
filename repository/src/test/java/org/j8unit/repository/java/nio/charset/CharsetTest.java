package org.j8unit.repository.java.nio.charset;

import java.nio.charset.Charset;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Charset} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.charset.CharsetTests}).
 */
@RunWith(J8Unit4.class)
public class CharsetTest
implements CharsetTests<Charset> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.Charset]

    @Override
    public Charset createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.charset.Charset], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.Charset]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.Charset]

}
