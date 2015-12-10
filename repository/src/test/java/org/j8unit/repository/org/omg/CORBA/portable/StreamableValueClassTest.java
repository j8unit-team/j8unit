package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamableValueClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.StreamableValueClassTests<org.omg.CORBA.portable.StreamableValue> {

    @Override
    public Class<org.omg.CORBA.portable.StreamableValue> createNewSUT() {
        return org.omg.CORBA.portable.StreamableValue.class;
    }

}
