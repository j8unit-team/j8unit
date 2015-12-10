package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TIMEOUTTest
implements org.j8unit.repository.org.omg.CORBA.TIMEOUTTests<org.omg.CORBA.TIMEOUT> {

    @Override
    public org.omg.CORBA.TIMEOUT createNewSUT() {
        return new org.omg.CORBA.TIMEOUT();
    }

}
