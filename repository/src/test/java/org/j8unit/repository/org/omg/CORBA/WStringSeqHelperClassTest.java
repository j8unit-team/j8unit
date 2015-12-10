package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WStringSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.WStringSeqHelperClassTests<org.omg.CORBA.WStringSeqHelper> {

    @Override
    public Class<org.omg.CORBA.WStringSeqHelper> createNewSUT() {
        return org.omg.CORBA.WStringSeqHelper.class;
    }

}
