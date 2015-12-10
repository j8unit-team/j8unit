package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnySeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.AnySeqHolderClassTests<org.omg.CORBA.AnySeqHolder> {

    @Override
    public Class<org.omg.CORBA.AnySeqHolder> createNewSUT() {
        return org.omg.CORBA.AnySeqHolder.class;
    }

}
