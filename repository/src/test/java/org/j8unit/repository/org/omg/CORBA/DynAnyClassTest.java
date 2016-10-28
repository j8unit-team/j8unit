package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynAny;

@RunWith(J8Unit4.class)
public class DynAnyClassTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyClassTests<DynAny> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynAny]

    @Override
    public Class<DynAny> createNewSUT() {
        return DynAny.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynAny]

}
