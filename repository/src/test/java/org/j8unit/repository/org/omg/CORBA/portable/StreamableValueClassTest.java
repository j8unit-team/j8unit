package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.StreamableValue;

@RunWith(J8Unit4.class)
public class StreamableValueClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.StreamableValueClassTests<StreamableValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.StreamableValue]

    @Override
    public Class<StreamableValue> createNewSUT() {
        return StreamableValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.StreamableValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.StreamableValue]

}
