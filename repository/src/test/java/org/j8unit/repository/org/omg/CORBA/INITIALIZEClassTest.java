package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INITIALIZEClassTest
implements org.j8unit.repository.org.omg.CORBA.INITIALIZEClassTests<org.omg.CORBA.INITIALIZE> {

    @Override
    public Class<org.omg.CORBA.INITIALIZE> createNewSUT() {
        return org.omg.CORBA.INITIALIZE.class;
    }

}
