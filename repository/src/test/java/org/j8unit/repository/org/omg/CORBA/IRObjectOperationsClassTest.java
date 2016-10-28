package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.IRObjectOperations;

@RunWith(J8Unit4.class)
public class IRObjectOperationsClassTest
implements org.j8unit.repository.org.omg.CORBA.IRObjectOperationsClassTests<IRObjectOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.IRObjectOperations]

    @Override
    public Class<IRObjectOperations> createNewSUT() {
        return IRObjectOperations.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.IRObjectOperations]

}
