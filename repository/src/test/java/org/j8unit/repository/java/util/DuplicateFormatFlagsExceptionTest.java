package org.j8unit.repository.java.util;

import java.util.DuplicateFormatFlagsException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DuplicateFormatFlagsException} (by
 * simply reusing the J8Unit test interface {@link org.j8unit.repository.java.util.DuplicateFormatFlagsExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class DuplicateFormatFlagsExceptionTest
implements DuplicateFormatFlagsExceptionTests<DuplicateFormatFlagsException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.DuplicateFormatFlagsException]

    @Override
    public DuplicateFormatFlagsException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.DuplicateFormatFlagsException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.DuplicateFormatFlagsException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.DuplicateFormatFlagsException]

}
