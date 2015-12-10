package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemarshalExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.RemarshalExceptionClassTests<org.omg.CORBA.portable.RemarshalException> {

    @Override
    public Class<org.omg.CORBA.portable.RemarshalException> createNewSUT() {
        return org.omg.CORBA.portable.RemarshalException.class;
    }

}
