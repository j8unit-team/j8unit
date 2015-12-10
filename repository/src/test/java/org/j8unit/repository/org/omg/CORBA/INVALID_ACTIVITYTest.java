package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INVALID_ACTIVITYTest
implements org.j8unit.repository.org.omg.CORBA.INVALID_ACTIVITYTests<org.omg.CORBA.INVALID_ACTIVITY> {

    @Override
    public org.omg.CORBA.INVALID_ACTIVITY createNewSUT() {
        return new org.omg.CORBA.INVALID_ACTIVITY();
    }

}
