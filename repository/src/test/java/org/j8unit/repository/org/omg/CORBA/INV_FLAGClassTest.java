package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INV_FLAGClassTest
implements org.j8unit.repository.org.omg.CORBA.INV_FLAGClassTests<org.omg.CORBA.INV_FLAG> {

    @Override
    public Class<org.omg.CORBA.INV_FLAG> createNewSUT() {
        return org.omg.CORBA.INV_FLAG.class;
    }

}
