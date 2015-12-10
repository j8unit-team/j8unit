package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.StringSeqHolderTests<org.omg.CORBA.StringSeqHolder> {

    @Override
    public org.omg.CORBA.StringSeqHolder createNewSUT() {
        return new org.omg.CORBA.StringSeqHolder();
    }

}
