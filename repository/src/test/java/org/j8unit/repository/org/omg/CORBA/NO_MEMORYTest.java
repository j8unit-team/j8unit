package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NO_MEMORYTest
implements org.j8unit.repository.org.omg.CORBA.NO_MEMORYTests<org.omg.CORBA.NO_MEMORY> {

    @Override
    public org.omg.CORBA.NO_MEMORY createNewSUT() {
        return new org.omg.CORBA.NO_MEMORY();
    }

}
