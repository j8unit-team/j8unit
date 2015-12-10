package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INV_POLICYTest
implements org.j8unit.repository.org.omg.CORBA.INV_POLICYTests<org.omg.CORBA.INV_POLICY> {

    @Override
    public org.omg.CORBA.INV_POLICY createNewSUT() {
        return new org.omg.CORBA.INV_POLICY();
    }

}
