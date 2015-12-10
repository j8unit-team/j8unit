package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CommunicationExceptionClassTest
implements org.j8unit.repository.javax.naming.CommunicationExceptionClassTests<javax.naming.CommunicationException> {

    @Override
    public Class<javax.naming.CommunicationException> createNewSUT() {
        return javax.naming.CommunicationException.class;
    }

}
