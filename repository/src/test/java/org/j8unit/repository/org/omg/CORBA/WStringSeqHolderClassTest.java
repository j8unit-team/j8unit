package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WStringSeqHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.WStringSeqHolderClassTests<org.omg.CORBA.WStringSeqHolder> {

    @Override
    public Class<org.omg.CORBA.WStringSeqHolder> createNewSUT() {
        return org.omg.CORBA.WStringSeqHolder.class;
    }

}
