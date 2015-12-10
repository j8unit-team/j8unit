package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TRANSIENTClassTest
implements org.j8unit.repository.org.omg.CORBA.TRANSIENTClassTests<org.omg.CORBA.TRANSIENT> {

    @Override
    public Class<org.omg.CORBA.TRANSIENT> createNewSUT() {
        return org.omg.CORBA.TRANSIENT.class;
    }

}
