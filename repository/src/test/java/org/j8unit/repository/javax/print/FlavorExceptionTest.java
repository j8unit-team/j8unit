package org.j8unit.repository.javax.print;

import javax.print.FlavorException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FlavorException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.FlavorExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class FlavorExceptionTest
implements FlavorExceptionTests<FlavorException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.FlavorException]

    @Override
    public FlavorException createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.FlavorException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.FlavorException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.FlavorException]

}
