package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynEnumClassTest
implements org.j8unit.repository.org.omg.CORBA.DynEnumClassTests<org.omg.CORBA.DynEnum> {

    @Override
    public Class<org.omg.CORBA.DynEnum> createNewSUT() {
        return org.omg.CORBA.DynEnum.class;
    }

}
