package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.CharSeqHolderTests<org.omg.CORBA.CharSeqHolder> {

    @Override
    public org.omg.CORBA.CharSeqHolder createNewSUT() {
        return new org.omg.CORBA.CharSeqHolder();
    }

}
