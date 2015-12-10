package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INITIALIZETest
implements org.j8unit.repository.org.omg.CORBA.INITIALIZETests<org.omg.CORBA.INITIALIZE> {

    @Override
    public org.omg.CORBA.INITIALIZE createNewSUT() {
        return new org.omg.CORBA.INITIALIZE();
    }

}
