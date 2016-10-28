package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXServerErrorException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXServerErrorExceptionTest
implements org.j8unit.repository.javax.management.remote.JMXServerErrorExceptionTests<JMXServerErrorException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXServerErrorException]

    @Override
    public JMXServerErrorException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.remote.JMXServerErrorException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.JMXServerErrorException]

}
