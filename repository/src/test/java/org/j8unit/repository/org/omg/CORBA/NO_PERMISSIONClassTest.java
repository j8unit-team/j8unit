package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NO_PERMISSIONClassTest
implements org.j8unit.repository.org.omg.CORBA.NO_PERMISSIONClassTests<org.omg.CORBA.NO_PERMISSION> {

    @Override
    public Class<org.omg.CORBA.NO_PERMISSION> createNewSUT() {
        return org.omg.CORBA.NO_PERMISSION.class;
    }

}
