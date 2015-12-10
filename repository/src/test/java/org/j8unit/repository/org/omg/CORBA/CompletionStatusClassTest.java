package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionStatusClassTest
implements org.j8unit.repository.org.omg.CORBA.CompletionStatusClassTests<org.omg.CORBA.CompletionStatus> {

    @Override
    public Class<org.omg.CORBA.CompletionStatus> createNewSUT() {
        return org.omg.CORBA.CompletionStatus.class;
    }

}
