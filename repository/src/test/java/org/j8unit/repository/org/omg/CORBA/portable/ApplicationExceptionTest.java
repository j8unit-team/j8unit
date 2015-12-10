package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ApplicationExceptionTest
implements org.j8unit.repository.org.omg.CORBA.portable.ApplicationExceptionTests<org.omg.CORBA.portable.ApplicationException> {

    @Override
    public org.omg.CORBA.portable.ApplicationException createNewSUT() {
        throw new AssertionError("There is no default constructor for [org.omg.CORBA.portable.ApplicationException] available.");
    }

}
