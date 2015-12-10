package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NO_IMPLEMENTTest
implements org.j8unit.repository.org.omg.CORBA.NO_IMPLEMENTTests<org.omg.CORBA.NO_IMPLEMENT> {

    @Override
    public org.omg.CORBA.NO_IMPLEMENT createNewSUT() {
        return new org.omg.CORBA.NO_IMPLEMENT();
    }

}
