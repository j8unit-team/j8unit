package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BooleanSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.BooleanSeqHelperClassTests<org.omg.CORBA.BooleanSeqHelper> {

    @Override
    public Class<org.omg.CORBA.BooleanSeqHelper> createNewSUT() {
        return org.omg.CORBA.BooleanSeqHelper.class;
    }

}
