package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BooleanSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.BooleanSeqHolderClassTests<org.omg.CORBA.BooleanSeqHolder> {

    @Override
    public Class<org.omg.CORBA.BooleanSeqHolder> createNewSUT() {
        return org.omg.CORBA.BooleanSeqHolder.class;
    }

}
