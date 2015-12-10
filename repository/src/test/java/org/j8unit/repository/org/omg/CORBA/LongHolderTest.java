package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongHolderTest
implements org.j8unit.repository.org.omg.CORBA.LongHolderTests<org.omg.CORBA.LongHolder> {

    @Override
    public org.omg.CORBA.LongHolder createNewSUT() {
        return new org.omg.CORBA.LongHolder();
    }

}
