package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynFixedClassTest
implements org.j8unit.repository.org.omg.CORBA.DynFixedClassTests<org.omg.CORBA.DynFixed> {

    @Override
    public Class<org.omg.CORBA.DynFixed> createNewSUT() {
        return org.omg.CORBA.DynFixed.class;
    }

}
