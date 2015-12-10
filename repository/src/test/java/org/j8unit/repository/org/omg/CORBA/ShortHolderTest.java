package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortHolderTest
implements org.j8unit.repository.org.omg.CORBA.ShortHolderTests<org.omg.CORBA.ShortHolder> {

    @Override
    public org.omg.CORBA.ShortHolder createNewSUT() {
        return new org.omg.CORBA.ShortHolder();
    }

}
