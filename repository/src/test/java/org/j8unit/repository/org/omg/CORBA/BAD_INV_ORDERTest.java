package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_INV_ORDERTest
implements org.j8unit.repository.org.omg.CORBA.BAD_INV_ORDERTests<org.omg.CORBA.BAD_INV_ORDER> {

    @Override
    public org.omg.CORBA.BAD_INV_ORDER createNewSUT() {
        return new org.omg.CORBA.BAD_INV_ORDER();
    }

}
