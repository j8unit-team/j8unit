package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharHolderTest
implements org.j8unit.repository.org.omg.CORBA.CharHolderTests<org.omg.CORBA.CharHolder> {

    @Override
    public org.omg.CORBA.CharHolder createNewSUT() {
        return new org.omg.CORBA.CharHolder();
    }

}
