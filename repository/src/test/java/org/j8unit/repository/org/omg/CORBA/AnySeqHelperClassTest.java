package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnySeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.AnySeqHelperClassTests<org.omg.CORBA.AnySeqHelper> {

    @Override
    public Class<org.omg.CORBA.AnySeqHelper> createNewSUT() {
        return org.omg.CORBA.AnySeqHelper.class;
    }

}
