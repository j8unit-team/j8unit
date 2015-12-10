package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MARSHALTest
implements org.j8unit.repository.org.omg.CORBA.MARSHALTests<org.omg.CORBA.MARSHAL> {

    @Override
    public org.omg.CORBA.MARSHAL createNewSUT() {
        return new org.omg.CORBA.MARSHAL();
    }

}
