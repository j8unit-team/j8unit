package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnyClassTest
implements org.j8unit.repository.org.omg.CORBA.AnyClassTests<org.omg.CORBA.Any> {

    @Override
    public Class<org.omg.CORBA.Any> createNewSUT() {
        return org.omg.CORBA.Any.class;
    }

}
