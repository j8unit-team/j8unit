package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueBase;

@RunWith(J8Unit4.class)
public class ValueBaseClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.ValueBaseClassTests<ValueBase> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.ValueBase]

    @Override
    public Class<ValueBase> createNewSUT() {
        return ValueBase.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.ValueBase]

}
