package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class COMM_FAILUREClassTest
implements org.j8unit.repository.org.omg.CORBA.COMM_FAILUREClassTests<org.omg.CORBA.COMM_FAILURE> {

    @Override
    public Class<org.omg.CORBA.COMM_FAILURE> createNewSUT() {
        return org.omg.CORBA.COMM_FAILURE.class;
    }

}
