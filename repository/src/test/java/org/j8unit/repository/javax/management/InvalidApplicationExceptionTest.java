package org.j8unit.repository.javax.management;

import javax.management.InvalidApplicationException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InvalidApplicationException} (by
 * simply reusing the J8Unit test interface {@link InvalidApplicationExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidApplicationExceptionTest
implements InvalidApplicationExceptionTests<InvalidApplicationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.InvalidApplicationException]

    @Override
    public InvalidApplicationException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.InvalidApplicationException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.InvalidApplicationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.InvalidApplicationException]

}
