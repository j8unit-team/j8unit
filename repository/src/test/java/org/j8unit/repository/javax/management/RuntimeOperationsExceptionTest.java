package org.j8unit.repository.javax.management;

import javax.management.RuntimeOperationsException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RuntimeOperationsException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.RuntimeOperationsExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class RuntimeOperationsExceptionTest
implements RuntimeOperationsExceptionTests<RuntimeOperationsException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.RuntimeOperationsException]

    @Override
    public RuntimeOperationsException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.RuntimeOperationsException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.RuntimeOperationsException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.RuntimeOperationsException]

}
