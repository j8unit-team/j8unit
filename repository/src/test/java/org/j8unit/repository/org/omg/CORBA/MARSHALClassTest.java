package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MARSHALClassTest
implements org.j8unit.repository.org.omg.CORBA.MARSHALClassTests<org.omg.CORBA.MARSHAL> {

    @Override
    public Class<org.omg.CORBA.MARSHAL> createNewSUT() {
        return org.omg.CORBA.MARSHAL.class;
    }

}
