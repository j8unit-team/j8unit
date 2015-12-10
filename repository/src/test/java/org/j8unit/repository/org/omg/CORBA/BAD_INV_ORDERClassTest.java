package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_INV_ORDERClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_INV_ORDERClassTests<org.omg.CORBA.BAD_INV_ORDER> {

    @Override
    public Class<org.omg.CORBA.BAD_INV_ORDER> createNewSUT() {
        return org.omg.CORBA.BAD_INV_ORDER.class;
    }

}
