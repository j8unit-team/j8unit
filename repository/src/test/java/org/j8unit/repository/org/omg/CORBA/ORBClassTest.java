package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ORBClassTest
implements org.j8unit.repository.org.omg.CORBA.ORBClassTests<org.omg.CORBA.ORB> {

    @Override
    public Class<org.omg.CORBA.ORB> createNewSUT() {
        return org.omg.CORBA.ORB.class;
    }

}
