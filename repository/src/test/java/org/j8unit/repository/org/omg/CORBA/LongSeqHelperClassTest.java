package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.LongSeqHelperClassTests<org.omg.CORBA.LongSeqHelper> {

    @Override
    public Class<org.omg.CORBA.LongSeqHelper> createNewSUT() {
        return org.omg.CORBA.LongSeqHelper.class;
    }

}
