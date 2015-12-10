package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownUserExceptionHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.UnknownUserExceptionHolderClassTests<org.omg.CORBA.UnknownUserExceptionHolder> {

    @Override
    public Class<org.omg.CORBA.UnknownUserExceptionHolder> createNewSUT() {
        return org.omg.CORBA.UnknownUserExceptionHolder.class;
    }

}
