package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INTERNALTest
implements org.j8unit.repository.org.omg.CORBA.INTERNALTests<org.omg.CORBA.INTERNAL> {

    @Override
    public org.omg.CORBA.INTERNAL createNewSUT() {
        return new org.omg.CORBA.INTERNAL();
    }

}
