package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.DoubleSeqHolderClassTests<org.omg.CORBA.DoubleSeqHolder> {

    @Override
    public Class<org.omg.CORBA.DoubleSeqHolder> createNewSUT() {
        return org.omg.CORBA.DoubleSeqHolder.class;
    }

}
