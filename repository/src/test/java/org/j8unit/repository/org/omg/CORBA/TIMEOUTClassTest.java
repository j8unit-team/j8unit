package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TIMEOUTClassTest
implements org.j8unit.repository.org.omg.CORBA.TIMEOUTClassTests<org.omg.CORBA.TIMEOUT> {

    @Override
    public Class<org.omg.CORBA.TIMEOUT> createNewSUT() {
        return org.omg.CORBA.TIMEOUT.class;
    }

}
