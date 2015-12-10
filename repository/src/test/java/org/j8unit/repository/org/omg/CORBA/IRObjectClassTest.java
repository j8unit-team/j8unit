package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IRObjectClassTest
implements org.j8unit.repository.org.omg.CORBA.IRObjectClassTests<org.omg.CORBA.IRObject> {

    @Override
    public Class<org.omg.CORBA.IRObject> createNewSUT() {
        return org.omg.CORBA.IRObject.class;
    }

}
