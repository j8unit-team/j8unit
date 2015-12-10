package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NO_IMPLEMENTClassTest
implements org.j8unit.repository.org.omg.CORBA.NO_IMPLEMENTClassTests<org.omg.CORBA.NO_IMPLEMENT> {

    @Override
    public Class<org.omg.CORBA.NO_IMPLEMENT> createNewSUT() {
        return org.omg.CORBA.NO_IMPLEMENT.class;
    }

}
