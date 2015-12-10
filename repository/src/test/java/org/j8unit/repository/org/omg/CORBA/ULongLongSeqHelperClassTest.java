package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ULongLongSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.ULongLongSeqHelperClassTests<org.omg.CORBA.ULongLongSeqHelper> {

    @Override
    public Class<org.omg.CORBA.ULongLongSeqHelper> createNewSUT() {
        return org.omg.CORBA.ULongLongSeqHelper.class;
    }

}
