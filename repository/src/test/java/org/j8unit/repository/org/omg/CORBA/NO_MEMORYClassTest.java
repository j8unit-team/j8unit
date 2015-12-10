package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NO_MEMORYClassTest
implements org.j8unit.repository.org.omg.CORBA.NO_MEMORYClassTests<org.omg.CORBA.NO_MEMORY> {

    @Override
    public Class<org.omg.CORBA.NO_MEMORY> createNewSUT() {
        return org.omg.CORBA.NO_MEMORY.class;
    }

}
