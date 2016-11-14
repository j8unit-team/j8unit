package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXServerErrorException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JMXServerErrorException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.remote.JMXServerErrorExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class JMXServerErrorExceptionTest
implements JMXServerErrorExceptionTests<JMXServerErrorException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXServerErrorException]

    @Override
    public JMXServerErrorException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.remote.JMXServerErrorException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.JMXServerErrorException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.JMXServerErrorException]

}
