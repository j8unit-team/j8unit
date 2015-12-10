package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class COMM_FAILURETest
implements org.j8unit.repository.org.omg.CORBA.COMM_FAILURETests<org.omg.CORBA.COMM_FAILURE> {

    @Override
    public org.omg.CORBA.COMM_FAILURE createNewSUT() {
        return new org.omg.CORBA.COMM_FAILURE();
    }

}
