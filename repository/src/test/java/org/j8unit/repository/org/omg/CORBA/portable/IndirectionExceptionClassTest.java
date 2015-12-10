package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IndirectionExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.IndirectionExceptionClassTests<org.omg.CORBA.portable.IndirectionException> {

    @Override
    public Class<org.omg.CORBA.portable.IndirectionException> createNewSUT() {
        return org.omg.CORBA.portable.IndirectionException.class;
    }

}
