package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UNKNOWNTest
implements org.j8unit.repository.org.omg.CORBA.UNKNOWNTests<org.omg.CORBA.UNKNOWN> {

    @Override
    public org.omg.CORBA.UNKNOWN createNewSUT() {
        return new org.omg.CORBA.UNKNOWN();
    }

}
