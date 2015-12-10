package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnySeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.AnySeqHolderTests<org.omg.CORBA.AnySeqHolder> {

    @Override
    public org.omg.CORBA.AnySeqHolder createNewSUT() {
        return new org.omg.CORBA.AnySeqHolder();
    }

}
