package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FREE_MEMTest
implements org.j8unit.repository.org.omg.CORBA.FREE_MEMTests<org.omg.CORBA.FREE_MEM> {

    @Override
    public org.omg.CORBA.FREE_MEM createNewSUT() {
        return new org.omg.CORBA.FREE_MEM();
    }

}
