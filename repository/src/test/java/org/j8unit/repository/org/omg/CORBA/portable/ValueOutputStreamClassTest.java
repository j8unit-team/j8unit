package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueOutputStream;

@RunWith(J8Unit4.class)
public class ValueOutputStreamClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.ValueOutputStreamClassTests<ValueOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.ValueOutputStream]

    @Override
    public Class<ValueOutputStream> createNewSUT() {
        return ValueOutputStream.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.ValueOutputStream]

}
