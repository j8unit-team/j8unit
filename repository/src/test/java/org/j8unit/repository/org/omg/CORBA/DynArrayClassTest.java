package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynArrayClassTest
implements org.j8unit.repository.org.omg.CORBA.DynArrayClassTests<org.omg.CORBA.DynArray> {

    @Override
    public Class<org.omg.CORBA.DynArray> createNewSUT() {
        return org.omg.CORBA.DynArray.class;
    }

}
