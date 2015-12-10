package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ULongSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.ULongSeqHelperClassTests<org.omg.CORBA.ULongSeqHelper> {

    @Override
    public Class<org.omg.CORBA.ULongSeqHelper> createNewSUT() {
        return org.omg.CORBA.ULongSeqHelper.class;
    }

}
