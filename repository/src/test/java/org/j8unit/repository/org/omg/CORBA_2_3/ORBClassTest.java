package org.j8unit.repository.org.omg.CORBA_2_3;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ORBClassTest
implements org.j8unit.repository.org.omg.CORBA_2_3.ORBClassTests<org.omg.CORBA_2_3.ORB> {

    @Override
    public Class<org.omg.CORBA_2_3.ORB> createNewSUT() {
        return org.omg.CORBA_2_3.ORB.class;
    }

}
