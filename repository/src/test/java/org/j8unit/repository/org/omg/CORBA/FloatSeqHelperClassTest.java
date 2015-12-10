package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FloatSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.FloatSeqHelperClassTests<org.omg.CORBA.FloatSeqHelper> {

    @Override
    public Class<org.omg.CORBA.FloatSeqHelper> createNewSUT() {
        return org.omg.CORBA.FloatSeqHelper.class;
    }

}
