package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_QOSClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_QOSClassTests<org.omg.CORBA.BAD_QOS> {

    @Override
    public Class<org.omg.CORBA.BAD_QOS> createNewSUT() {
        return org.omg.CORBA.BAD_QOS.class;
    }

}
