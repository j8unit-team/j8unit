package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INV_FLAGTest
implements org.j8unit.repository.org.omg.CORBA.INV_FLAGTests<org.omg.CORBA.INV_FLAG> {

    @Override
    public org.omg.CORBA.INV_FLAG createNewSUT() {
        return new org.omg.CORBA.INV_FLAG();
    }

}
