package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMExceptionTest
implements org.j8unit.repository.javax.management.JMExceptionTests<javax.management.JMException> {

    @Override
    public javax.management.JMException createNewSUT() {
        return new javax.management.JMException();
    }

}
