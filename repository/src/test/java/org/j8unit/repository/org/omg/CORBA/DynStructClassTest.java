package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynStructClassTest
implements org.j8unit.repository.org.omg.CORBA.DynStructClassTests<org.omg.CORBA.DynStruct> {

    @Override
    public Class<org.omg.CORBA.DynStruct> createNewSUT() {
        return org.omg.CORBA.DynStruct.class;
    }

}
