package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INTERNALClassTest
implements org.j8unit.repository.org.omg.CORBA.INTERNALClassTests<org.omg.CORBA.INTERNAL> {

    @Override
    public Class<org.omg.CORBA.INTERNAL> createNewSUT() {
        return org.omg.CORBA.INTERNAL.class;
    }

}
