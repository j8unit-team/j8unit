package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BooleanHolderTest
implements org.j8unit.repository.org.omg.CORBA.BooleanHolderTests<org.omg.CORBA.BooleanHolder> {

    @Override
    public org.omg.CORBA.BooleanHolder createNewSUT() {
        return new org.omg.CORBA.BooleanHolder();
    }

}
