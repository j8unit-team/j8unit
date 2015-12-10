package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SystemExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.SystemExceptionClassTests<org.omg.CORBA.SystemException> {

    @Override
    public Class<org.omg.CORBA.SystemException> createNewSUT() {
        return org.omg.CORBA.SystemException.class;
    }

}
