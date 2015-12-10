package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UNKNOWNClassTest
implements org.j8unit.repository.org.omg.CORBA.UNKNOWNClassTests<org.omg.CORBA.UNKNOWN> {

    @Override
    public Class<org.omg.CORBA.UNKNOWN> createNewSUT() {
        return org.omg.CORBA.UNKNOWN.class;
    }

}
