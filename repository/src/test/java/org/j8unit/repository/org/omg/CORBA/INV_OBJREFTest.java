package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INV_OBJREFTest
implements org.j8unit.repository.org.omg.CORBA.INV_OBJREFTests<org.omg.CORBA.INV_OBJREF> {

    @Override
    public org.omg.CORBA.INV_OBJREF createNewSUT() {
        return new org.omg.CORBA.INV_OBJREF();
    }

}
