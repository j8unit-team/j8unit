package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OctetSeqHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.OctetSeqHelperClassTests<org.omg.CORBA.OctetSeqHelper> {

    @Override
    public Class<org.omg.CORBA.OctetSeqHelper> createNewSUT() {
        return org.omg.CORBA.OctetSeqHelper.class;
    }

}
