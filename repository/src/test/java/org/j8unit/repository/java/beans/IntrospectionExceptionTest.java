package org.j8unit.repository.java.beans;

import java.beans.IntrospectionException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IntrospectionException} (by simply
 * reusing the J8Unit test interface {@link IntrospectionExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class IntrospectionExceptionTest
implements IntrospectionExceptionTests<IntrospectionException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.IntrospectionException]

    @Override
    public IntrospectionException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.IntrospectionException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.IntrospectionException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.IntrospectionException]

}
