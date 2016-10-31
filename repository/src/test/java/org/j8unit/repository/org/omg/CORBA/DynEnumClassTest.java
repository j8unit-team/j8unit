package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynEnum;

@RunWith(J8Unit4.class)
public class DynEnumClassTest
implements org.j8unit.repository.org.omg.CORBA.DynEnumClassTests<DynEnum> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynEnum]

    @Override
    public Class<DynEnum> createNewSUT() {
        return DynEnum.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynEnum]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynEnum]

}
