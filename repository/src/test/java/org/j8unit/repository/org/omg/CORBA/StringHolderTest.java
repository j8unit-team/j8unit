package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringHolderTest
implements org.j8unit.repository.org.omg.CORBA.StringHolderTests<org.omg.CORBA.StringHolder> {

    @Override
    public org.omg.CORBA.StringHolder createNewSUT() {
        return new org.omg.CORBA.StringHolder();
    }

}
