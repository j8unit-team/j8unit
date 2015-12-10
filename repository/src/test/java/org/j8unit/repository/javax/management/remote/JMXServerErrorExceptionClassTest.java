package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXServerErrorExceptionClassTest
implements org.j8unit.repository.javax.management.remote.JMXServerErrorExceptionClassTests<javax.management.remote.JMXServerErrorException> {

    @Override
    public Class<javax.management.remote.JMXServerErrorException> createNewSUT() {
        return javax.management.remote.JMXServerErrorException.class;
    }

}
