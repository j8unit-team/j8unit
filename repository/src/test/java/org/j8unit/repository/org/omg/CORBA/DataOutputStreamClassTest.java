package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DataOutputStream;

@RunWith(J8Unit4.class)
public class DataOutputStreamClassTest
implements org.j8unit.repository.org.omg.CORBA.DataOutputStreamClassTests<DataOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DataOutputStream]

    @Override
    public Class<DataOutputStream> createNewSUT() {
        return DataOutputStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DataOutputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DataOutputStream]

}
