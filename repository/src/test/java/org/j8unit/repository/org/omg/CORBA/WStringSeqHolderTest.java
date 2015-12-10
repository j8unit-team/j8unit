package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WStringSeqHolderTest
implements org.j8unit.repository.org.omg.CORBA.WStringSeqHolderTests<org.omg.CORBA.WStringSeqHolder> {

    @Override
    public org.omg.CORBA.WStringSeqHolder createNewSUT() {
        return new org.omg.CORBA.WStringSeqHolder();
    }

}
