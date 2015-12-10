package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UtilClassTest
implements org.j8unit.repository.javax.rmi.CORBA.UtilClassTests<javax.rmi.CORBA.Util> {

    @Override
    public Class<javax.rmi.CORBA.Util> createNewSUT() {
        return javax.rmi.CORBA.Util.class;
    }

}
