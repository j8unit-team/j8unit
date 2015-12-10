package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UShortSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.UShortSeqHelperClassTests<org.omg.CORBA.UShortSeqHelper> {

    @Override
    public Class<org.omg.CORBA.UShortSeqHelper> createNewSUT() {
        return org.omg.CORBA.UShortSeqHelper.class;
    }

}
