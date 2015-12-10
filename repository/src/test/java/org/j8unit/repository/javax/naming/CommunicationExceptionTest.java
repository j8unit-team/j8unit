package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommunicationExceptionTest
implements org.j8unit.repository.javax.naming.CommunicationExceptionTests<javax.naming.CommunicationException> {

    @Override
    public javax.naming.CommunicationException createNewSUT() {
        return new javax.naming.CommunicationException();
    }

}
