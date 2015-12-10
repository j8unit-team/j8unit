package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectClassTest
implements org.j8unit.repository.org.omg.CORBA.ObjectClassTests<org.omg.CORBA.Object> {

    @Override
    public Class<org.omg.CORBA.Object> createNewSUT() {
        return org.omg.CORBA.Object.class;
    }

}
