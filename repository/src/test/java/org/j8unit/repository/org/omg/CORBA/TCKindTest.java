package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TCKindTest
implements org.j8unit.repository.org.omg.CORBA.TCKindTests<org.omg.CORBA.TCKind> {

    @Override
    public org.omg.CORBA.TCKind createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.omg.CORBA.TCKind] available.");
    }

}
