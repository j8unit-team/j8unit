package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueBaseClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.ValueBaseClassTests<org.omg.CORBA.portable.ValueBase> {

    @Override
    public Class<org.omg.CORBA.portable.ValueBase> createNewSUT() {
        return org.omg.CORBA.portable.ValueBase.class;
    }

}
