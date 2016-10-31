package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynStruct;

@RunWith(J8Unit4.class)
public class DynStructClassTest
implements org.j8unit.repository.org.omg.CORBA.DynStructClassTests<DynStruct> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynStruct]

    @Override
    public Class<DynStruct> createNewSUT() {
        return DynStruct.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynStruct]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynStruct]

}
