package org.j8unit.repository.java.nio.charset;

import java.nio.charset.UnsupportedCharsetException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnsupportedCharsetException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.charset.UnsupportedCharsetExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class UnsupportedCharsetExceptionTest
implements UnsupportedCharsetExceptionTests<UnsupportedCharsetException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.UnsupportedCharsetException]

    @Override
    public UnsupportedCharsetException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.charset.UnsupportedCharsetException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.UnsupportedCharsetException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.UnsupportedCharsetException]

}
