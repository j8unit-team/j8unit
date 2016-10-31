package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueFactory;

@RunWith(J8Unit4.class)
public class ValueFactoryClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.ValueFactoryClassTests<ValueFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.ValueFactory]

    @Override
    public Class<ValueFactory> createNewSUT() {
        return ValueFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.ValueFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.ValueFactory]

}
