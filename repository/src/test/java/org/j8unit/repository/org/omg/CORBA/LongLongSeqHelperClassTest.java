package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongLongSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.LongLongSeqHelperClassTests<org.omg.CORBA.LongLongSeqHelper> {

    @Override
    public Class<org.omg.CORBA.LongLongSeqHelper> createNewSUT() {
        return org.omg.CORBA.LongLongSeqHelper.class;
    }

}
