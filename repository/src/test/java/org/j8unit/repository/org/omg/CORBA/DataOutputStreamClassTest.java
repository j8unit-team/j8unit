package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataOutputStreamClassTest
implements org.j8unit.repository.org.omg.CORBA.DataOutputStreamClassTests<org.omg.CORBA.DataOutputStream> {

    @Override
    public Class<org.omg.CORBA.DataOutputStream> createNewSUT() {
        return org.omg.CORBA.DataOutputStream.class;
    }

}
