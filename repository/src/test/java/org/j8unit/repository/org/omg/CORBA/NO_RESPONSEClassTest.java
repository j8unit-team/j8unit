package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NO_RESPONSEClassTest
implements org.j8unit.repository.org.omg.CORBA.NO_RESPONSEClassTests<org.omg.CORBA.NO_RESPONSE> {

    @Override
    public Class<org.omg.CORBA.NO_RESPONSE> createNewSUT() {
        return org.omg.CORBA.NO_RESPONSE.class;
    }

}
