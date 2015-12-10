package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.DoubleSeqHelperClassTests<org.omg.CORBA.DoubleSeqHelper> {

    @Override
    public Class<org.omg.CORBA.DoubleSeqHelper> createNewSUT() {
        return org.omg.CORBA.DoubleSeqHelper.class;
    }

}
