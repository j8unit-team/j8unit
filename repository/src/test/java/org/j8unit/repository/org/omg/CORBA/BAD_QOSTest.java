package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_QOSTest
implements org.j8unit.repository.org.omg.CORBA.BAD_QOSTests<org.omg.CORBA.BAD_QOS> {

    @Override
    public org.omg.CORBA.BAD_QOS createNewSUT() {
        return new org.omg.CORBA.BAD_QOS();
    }

}
