package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.ShortSeqHelperClassTests<org.omg.CORBA.ShortSeqHelper> {

    @Override
    public Class<org.omg.CORBA.ShortSeqHelper> createNewSUT() {
        return org.omg.CORBA.ShortSeqHelper.class;
    }

}
