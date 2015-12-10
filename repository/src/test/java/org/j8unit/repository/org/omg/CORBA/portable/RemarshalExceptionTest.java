package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemarshalExceptionTest
implements org.j8unit.repository.org.omg.CORBA.portable.RemarshalExceptionTests<org.omg.CORBA.portable.RemarshalException> {

    @Override
    public org.omg.CORBA.portable.RemarshalException createNewSUT() {
        return new org.omg.CORBA.portable.RemarshalException();
    }

}
