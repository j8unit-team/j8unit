package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXServerErrorExceptionTest
implements org.j8unit.repository.javax.management.remote.JMXServerErrorExceptionTests<javax.management.remote.JMXServerErrorException> {

    @Override
    public javax.management.remote.JMXServerErrorException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.remote.JMXServerErrorException] available.");
    }

}
