package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.UnknownExceptionClassTests<org.omg.CORBA.portable.UnknownException> {

    @Override
    public Class<org.omg.CORBA.portable.UnknownException> createNewSUT() {
        return org.omg.CORBA.portable.UnknownException.class;
    }

}
