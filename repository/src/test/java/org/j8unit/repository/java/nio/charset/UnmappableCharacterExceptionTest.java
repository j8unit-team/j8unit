package org.j8unit.repository.java.nio.charset;

import java.nio.charset.UnmappableCharacterException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnmappableCharacterException} (by
 * simply reusing the J8Unit test interface {@link UnmappableCharacterExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class UnmappableCharacterExceptionTest
implements UnmappableCharacterExceptionTests<UnmappableCharacterException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.UnmappableCharacterException]

    @Override
    public UnmappableCharacterException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.charset.UnmappableCharacterException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.UnmappableCharacterException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.UnmappableCharacterException]

}
