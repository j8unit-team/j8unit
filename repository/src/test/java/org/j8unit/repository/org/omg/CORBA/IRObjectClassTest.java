package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.IRObject;

@RunWith(J8Unit4.class)
public class IRObjectClassTest
implements org.j8unit.repository.org.omg.CORBA.IRObjectClassTests<IRObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.IRObject]

    @Override
    public Class<IRObject> createNewSUT() {
        return IRObject.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.IRObject]

}
