package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionStatusTest
implements org.j8unit.repository.org.omg.CORBA.CompletionStatusTests<org.omg.CORBA.CompletionStatus> {

    @Override
    public org.omg.CORBA.CompletionStatus createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.omg.CORBA.CompletionStatus] available.");
    }

}
