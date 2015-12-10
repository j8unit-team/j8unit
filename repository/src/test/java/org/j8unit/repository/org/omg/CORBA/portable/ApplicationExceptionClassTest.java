package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ApplicationExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.ApplicationExceptionClassTests<org.omg.CORBA.portable.ApplicationException> {

    @Override
    public Class<org.omg.CORBA.portable.ApplicationException> createNewSUT() {
        return org.omg.CORBA.portable.ApplicationException.class;
    }

}
