package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UtilDelegateClassTest
implements org.j8unit.repository.javax.rmi.CORBA.UtilDelegateClassTests<javax.rmi.CORBA.UtilDelegate> {

    @Override
    public Class<javax.rmi.CORBA.UtilDelegate> createNewSUT() {
        return javax.rmi.CORBA.UtilDelegate.class;
    }

}
