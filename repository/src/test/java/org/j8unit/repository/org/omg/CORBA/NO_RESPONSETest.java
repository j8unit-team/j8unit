package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NO_RESPONSETest
implements org.j8unit.repository.org.omg.CORBA.NO_RESPONSETests<org.omg.CORBA.NO_RESPONSE> {

    @Override
    public org.omg.CORBA.NO_RESPONSE createNewSUT() {
        return new org.omg.CORBA.NO_RESPONSE();
    }

}
