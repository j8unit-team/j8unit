package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynValueClassTest
implements org.j8unit.repository.org.omg.CORBA.DynValueClassTests<org.omg.CORBA.DynValue> {

    @Override
    public Class<org.omg.CORBA.DynValue> createNewSUT() {
        return org.omg.CORBA.DynValue.class;
    }

}
