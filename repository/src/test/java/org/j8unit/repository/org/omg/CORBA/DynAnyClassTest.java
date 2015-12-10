package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynAnyClassTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyClassTests<org.omg.CORBA.DynAny> {

    @Override
    public Class<org.omg.CORBA.DynAny> createNewSUT() {
        return org.omg.CORBA.DynAny.class;
    }

}
