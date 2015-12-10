package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WCharSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.WCharSeqHelperClassTests<org.omg.CORBA.WCharSeqHelper> {

    @Override
    public Class<org.omg.CORBA.WCharSeqHelper> createNewSUT() {
        return org.omg.CORBA.WCharSeqHelper.class;
    }

}
