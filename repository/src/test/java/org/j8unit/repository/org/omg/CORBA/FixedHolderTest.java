package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FixedHolderTest
implements org.j8unit.repository.org.omg.CORBA.FixedHolderTests<org.omg.CORBA.FixedHolder> {

    @Override
    public org.omg.CORBA.FixedHolder createNewSUT() {
        return new org.omg.CORBA.FixedHolder();
    }

}
